package net.sunofbeach.taobao.data;


import com.taobao.api.ApiException;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.*;
import com.taobao.api.response.*;

import net.sunofbeach.taobao.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class API {

    private static final String TAG = "API";

    @Autowired
    private TaobaoClient client;

    /**
     * 获取选品分类库，然后UI根据分类库动态地渲染出来
     */
    public String getOptimus(long page) throws ApiException {
        if (page < 1) {
            page = 1;
        }
        //获取到推荐列表
        TbkDgOptimusMaterialRequest req = new TbkDgOptimusMaterialRequest();
        req.setPageSize(Constants.PAGE_SIZE / 2 + 2);
        req.setAdzoneId(Constants.AD_ZONE_ID);
        req.setPageNo(page);
        req.setMaterialId(31519L);
        TbkDgOptimusMaterialResponse rsp = client.execute(req);
        // System.out.println(rsp.getBody());
        return rsp.getBody();
    }


    /**
     * 获取精选的内容，获取选品分类库里的内容
     *
     * @param favoritesId
     * @return
     * @throws ApiException
     */
    public String getFavoritesGoods(long favoritesId) throws ApiException {
        TbkDgOptimusMaterialRequest req = new TbkDgOptimusMaterialRequest();
        req.setPageSize(Constants.PAGE_SIZE);
        req.setAdzoneId(Constants.AD_ZONE_ID);
        req.setMaterialId(31539L);
        req.setFavoritesId(String.valueOf(favoritesId));
        req.setPageNo(1L);
        TbkDgOptimusMaterialResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
        return rsp.getBody();
    }

    /**
     * 获取推荐内容
     *
     * @param page
     * @param materialId
     * @return
     * @throws ApiException
     */
    public String getRecommendList(long page, long materialId, long size) throws ApiException {
        if (page < 1) {
            page = 1;
        }
        //获取到推荐列表
        TbkDgOptimusMaterialRequest req = new TbkDgOptimusMaterialRequest();
        req.setPageSize(size);
        req.setAdzoneId(Constants.AD_ZONE_ID);
        req.setPageNo(page);
        req.setMaterialId(materialId);
        TbkDgOptimusMaterialResponse rsp = client.execute(req);
        //System.out.println(rsp.getBody());
        return rsp.getBody();
    }

    public String getRecommendList(long page, long materialId) throws ApiException {
        if (page < 1) {
            page = 1;
        }
        //获取到推荐列表
        TbkDgOptimusMaterialRequest req = new TbkDgOptimusMaterialRequest();
        req.setPageSize(Constants.PAGE_SIZE / 2 + 2);
        req.setAdzoneId(Constants.AD_ZONE_ID);
        req.setPageNo(page);
        req.setMaterialId(materialId);
        TbkDgOptimusMaterialResponse rsp = client.execute(req);
        //System.out.println(rsp.getBody());
        return rsp.getBody();
    }

    /**
     * 获取搜素内容
     *
     * @param keyword
     * @param page
     * @return
     * @throws ApiException
     */
    public String getSearchContent(String keyword, long page) throws ApiException {
        TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
        req.setAdzoneId(Constants.AD_ZONE_ID);
        //req.setHasCoupon(true);
        req.setPageSize(Constants.PAGE_SIZE / 4);
        req.setQ(keyword);
        req.setPageNo(page);
        //req.setIsTmall(true);
        TbkDgMaterialOptionalResponse rsp = client.execute(req);
        //System.out.println(rsp.getBody());
        return rsp.getBody();
    }

    public String getTpwd(String url, String tips) throws ApiException {
        TbkTpwdCreateRequest req = new TbkTpwdCreateRequest();
        req.setText(tips);
        req.setUrl(url);
        req.setLogo("https://uland.taobao.com/");
        req.setExt("{}");
        TbkTpwdCreateResponse rsp = client.execute(req);
        String result = rsp.getBody();
        //LogUtil.d(TAG, "result -- > " + result);
        return result;
    }

    public String getCloseGoods(long goodsId) throws ApiException {
        TbkItemRecommendGetRequest req = new TbkItemRecommendGetRequest();
        req.setFields("num_iid,title,pict_url,small_images,reserve_price,zk_final_price,user_type,provcity,item_url");
        req.setNumIid(goodsId);
        req.setCount(20L);
        req.setPlatform(1L);
        TbkItemRecommendGetResponse rsp = client.execute(req);
        // System.out.println(rsp.getBody());
        return rsp.getBody();
    }

    public String getContent(long type, long lastTimestamp) throws ApiException {
        TbkContentGetRequest req = new TbkContentGetRequest();
        req.setAdzoneId(Constants.AD_ZONE_ID);
        //内容类型，1:图文、2: 图集、3: 短视频
        req.setType(type);
        //表示取这个时间点以前的数据，
        // 以毫秒为单位（出参中的last_timestamp是指本次返回的内容中最早一条的数据，
        // 下一次作为before_timestamp传过来，即可实现翻页）
        req.setBeforeTimestamp(lastTimestamp);
        req.setCount(Constants.PAGE_SIZE);
        req.setImageWidth(300L);
        req.setImageHeight(300L);
        req.setContentSet(1L);
        TbkContentGetResponse execute = client.execute(req);
        return execute.getBody();
    }

    public String getShortUrl(String targetUrl) throws ApiException {
        TbkSpreadGetRequest req = new TbkSpreadGetRequest();
        List<TbkSpreadGetRequest.TbkSpreadRequest> list2 = new ArrayList<>();
        TbkSpreadGetRequest.TbkSpreadRequest obj3 = new TbkSpreadGetRequest.TbkSpreadRequest();
        list2.add(obj3);
        obj3.setUrl(targetUrl);
        req.setRequests(list2);
        TbkSpreadGetResponse rsp = client.execute(req);
        return rsp.getBody();
    }
}
