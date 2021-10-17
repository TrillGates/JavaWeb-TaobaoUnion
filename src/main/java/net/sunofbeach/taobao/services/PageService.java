package net.sunofbeach.taobao.services;

import com.google.gson.Gson;
import com.taobao.api.ApiException;
import lombok.extern.slf4j.Slf4j;

import net.sunofbeach.taobao.beans.*;
import net.sunofbeach.taobao.data.API;
import net.sunofbeach.taobao.response.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * 页面服务，就是获取页面数据的
 */
@Slf4j
@Service
public class PageService {

    @Autowired
    private API api;

    public MainPageMenuNew getMainPageMenu(long page) throws Exception {
        String menujson = api.getOptimus(page);
        System.out.println(menujson);
        MainPageMenuNew mainPageMenu = gson.fromJson(menujson, MainPageMenuNew.class);
        return mainPageMenu;
    }

    public MainPageGoodsNew getMainGoodsList(long favoritesId) throws ApiException {
        String favoritesGoods = api.getFavoritesGoods(favoritesId);
        MainPageGoodsNew mainPageGoods = gson.fromJson(favoritesGoods, MainPageGoodsNew.class);
        return mainPageGoods;
    }

    public DiscoveryItem getDiscoveryList(long page, long materialId) throws ApiException {
        String recommendListStr = api.getRecommendList(page, materialId);
        //推荐列表内容
        DiscoveryItem discoveryItem = gson.fromJson(recommendListStr, DiscoveryItem.class);
        return discoveryItem;
    }

    public Tpwd createTpwd(String title, String url) {
        try {
            Tpwd tpwd = getTpwd(title, url);
            if (tpwd.getTbk_tpwd_create_response() == null) {
                tpwd = getTpwd(title, url);
            }
            return tpwd;
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Autowired
    private Gson gson;

    private Tpwd getTpwd(String title, String url) throws ApiException {
        String result = api.getTpwd(url, title);
        return gson.fromJson(result, Tpwd.class);
    }

    public RelativeItem getCloseGoods(long id) {
        try {
            String closeGoods = api.getCloseGoods(id);
            RelativeItem relativeItem = gson.fromJson(closeGoods, RelativeItem.class);
            return relativeItem;
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static final long[] sCategoriesList = {9660L, 9649L, 9656L, 9653L, 9651L, 9648L, 9655L};

    @Autowired
    private Random random;

    /**
     * 随即获取推荐内容
     */
    public R getRecommendRandomList(long size) {
        long categoryId = sCategoriesList[random.nextInt(sCategoriesList.length)];
        try {
            String recommendList = api.getRecommendList(random.nextInt(20), categoryId, size);
            DiscoveryItem discoveryItem = gson.fromJson(recommendList, DiscoveryItem.class);
            return R.SUCCESS("获取推荐列表成功.").setData(discoveryItem);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return R.FAILED("获取失败.");
    }


    /**
     * type:内容类型，1:图文、2: 图集、3: 短视频
     * timestamp:
     * 表示取这个时间点以前的数据，
     * 以毫秒为单位（出参中的last_timestamp是指本次返回的内容中最早一条的数据，
     * 下一次作为before_timestamp传过来，即可实现翻页）
     *
     * @return
     */
    public R getImageContent(long timestamp) {
        if (timestamp == 0) {
            timestamp = System.currentTimeMillis();
        }
        try {
            String content = api.getContent(3L, timestamp);
            log.info(content);
            return R.SUCCESS("获取成功.");
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return R.FAILED("获取失败.");
    }


    public R getShortLink(String targetUrl) {
        try {
            String shortUrl = api.getShortUrl(targetUrl);
            log.info(shortUrl);
            ShortLink shortLink = gson.fromJson(shortUrl, ShortLink.class);
            return R.SUCCESS("获取成功.").setData(shortLink);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return R.FAILED("获取失败.");
    }

}
