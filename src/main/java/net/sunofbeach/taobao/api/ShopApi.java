package net.sunofbeach.taobao.api;


import com.taobao.api.ApiException;
import lombok.extern.slf4j.Slf4j;

import net.sunofbeach.taobao.beans.*;
import net.sunofbeach.taobao.response.R;
import net.sunofbeach.taobao.services.PageService;
import net.sunofbeach.taobao.services.SearchService;
import net.sunofbeach.taobao.utils.CategoriesList;
import net.sunofbeach.taobao.utils.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
@RestController
public class ShopApi {

    private static final String TAG = "ShopApiController";

    @Autowired
    private PageService pageService;


    /**
     * 获取分类内容
     *
     * @return
     */
    @GetMapping("/shop/discovery/categories")
    public R getDiscoveryCategories() {
        CategoriesList instance = CategoriesList.getInstance();
        List<CategoryItem> categoryItems = instance.getsData();
        R success = R.SUCCESS("获取分类成功.");
        success.setData(categoryItems);
        return success;
    }


    /**
     * 根据分类获取发现页的内容
     *
     * @param page
     * @param materialId
     * @return
     */
    @GetMapping("/shop/discovery/{materialId}/{page}")
    public R getDiscoveryListById(@PathVariable("page") int page, @PathVariable("materialId") long materialId) {
        try {
            DiscoveryItem discoveryList = pageService.getDiscoveryList(page, materialId);
            R success = R.SUCCESS("获取成功.");
            List<DiscoveryItem.TbkDgOptimusMaterialResponseBean.ResultListBean.MapDataBean> map_data = discoveryList.getTbk_dg_optimus_material_response().getResult_list().getMap_data();
            success.setData(map_data);
            return success;
            //处理一下列表内容
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return R.FAILED("获取失败.");
    }


    /**
     * 生成淘口令的接口
     *
     * @return
     */
    @PostMapping("/shop/tpwd")
    public R getTaobaoToken(@RequestBody TicketRequestItem item) {
        // System.out.println("url -- > " + item.getUrl());
        if (TextUtils.isEmpty(item.getUrl())) {
            return R.FAILED("url 不可以为空.");
        }
        if (TextUtils.isEmpty(item.getTitle())) {
            item.setTitle("领券购买，更加优惠");
        }
        Tpwd tpwd = pageService.createTpwd(item.getTitle(), item.getUrl());
        if (tpwd != null) {
            R success = R.SUCCESS("淘宝口令构建成功!");
            success.setData(tpwd);
            return success;
        }
        return R.FAILED("淘宝口令生成失败.");
    }

    /**
     * 获取相关商品的接口
     *
     * @param goodsId 商品ID
     * @return
     */
    @PostMapping("/shop/goods/relative")
    public R getCloseGoods(@PathParam("goodsId") String goodsId) {
        log.info(TAG, "goodsId -- > " + goodsId);
        if (TextUtils.isEmpty(goodsId)) {
            return R.FAILED("商品ID不可以为空.");
        }
        try {
            long id = Long.parseLong(goodsId);
            RelativeItem closeGoods = pageService.getCloseGoods(id);
            if (closeGoods != null) {
                R success = R.SUCCESS("获取相关商品成功.");
                success.setData(closeGoods);
                return success;
            } else {
                return R.FAILED("获取相关商品失败.");
            }
        } catch (Exception e) {
            return R.FAILED("id没有符合格式填写.");
        }
    }


    @Autowired
    private SearchService searchService;

    @GetMapping("/shop/search")
    public R doSearch(@PathParam("page") int page, @PathParam("keyword") String keyword) {
        if (TextUtils.isEmpty(keyword)) {
            return R.FAILED("关键字不能为空.");
        }
        if (page < 1) {
            page = 1;
        }
        SearchResult searchResult = searchService.doSearch(keyword, page);
        if (searchResult != null) {
            R success = R.SUCCESS("搜索成功.");
            success.setData(searchResult);
            return success;
        }
        return R.FAILED("搜索失败.");
    }

    @GetMapping("/shop/onSell/{page}")
    public R getOnSell(@PathVariable("page") int page) {
        if (page < 1) {
            page = 1;
        }
        try {
            DiscoveryItem discoveryList = pageService.getDiscoveryList(page, 3756L);
            if (discoveryList != null) {
                R success = R.SUCCESS("获取特惠成功.");
                success.setData(discoveryList);
                return success;
            }
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return R.FAILED("获取特惠商品失败.");
    }


    @GetMapping("/shop/recommend/categories")
    public R getRecommendCategories() {
        MainPageMenuNew mainPageMenu;
        try {
            mainPageMenu = pageService.getMainPageMenu(1);
            List<MainPageMenu.TbkUatmFavoritesGetResponseBean.ResultsBean.TbkFavoritesBean> result = new ArrayList<>();
            List<MainPageMenuNew.TbkDgOptimusMaterialResponseBean.ResultListBean.MapDataBean.FavoritesInfoBean.FavoritesListBean.FavoritesDetailBean> favorites_detail =
                    mainPageMenu.getTbk_dg_optimus_material_response().getResult_list().getMap_data().get(0).getFavorites_info().getFavorites_list().getFavorites_detail();
            for (MainPageMenuNew.TbkDgOptimusMaterialResponseBean.ResultListBean.MapDataBean.FavoritesInfoBean.FavoritesListBean.FavoritesDetailBean favoritesDetailBean : favorites_detail) {
                MainPageMenu.TbkUatmFavoritesGetResponseBean.ResultsBean.TbkFavoritesBean item =
                        new MainPageMenu.TbkUatmFavoritesGetResponseBean.ResultsBean.TbkFavoritesBean();
                item.setFavorites_title(favoritesDetailBean.getFavorites_title());
                item.setFavorites_id(favoritesDetailBean.getFavorites_id());
                result.add(item);
            }
            Collections.reverse(result);
            R success = R.SUCCESS("获取精选分类成功.");
            success.setData(result);
            return success;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return R.FAILED("获取分类失败.");
    }



    /**
     * 搜索推荐词
     *
     * @return
     */
    @GetMapping("/shop/search/recommend")
    public R getSearchRecommend() {
        return searchService.getTbSearchRecommend();
    }

    @GetMapping("/shop/recommend/{categoryId}")
    public R getRecommendList(@PathVariable("categoryId") String categoryId) {
        try {
            long idLong = Long.parseLong(categoryId);
            MainPageGoodsNew mainGoodsList = pageService.getMainGoodsList(idLong);
            if (mainGoodsList != null) {
                R success = R.SUCCESS("获取精选内容成功.");
                success.setData(mainGoodsList);
                return success;
            }
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return R.FAILED("获取精选列表失败.");
    }


    @GetMapping("/shop/recommend/random/{size}")
    public R getRecommendList(@PathVariable("size") int size) {
        return pageService.getRecommendRandomList(size);
    }


    @GetMapping("/shop/content/image/{timestamp}")
    public R getImageContent(@PathVariable("timestamp") int timestamp) {
        return pageService.getImageContent(timestamp);
    }

    @GetMapping("/shop/short-url")
    public R getShortLink(@RequestParam("targetUrl") String targetUrl) {
        return pageService.getShortLink(targetUrl);
    }
}
