package net.sunofbeach.taobao.services;

import com.google.gson.Gson;
import com.taobao.api.ApiException;

import net.sunofbeach.taobao.beans.SearchResult;
import net.sunofbeach.taobao.data.API;
import net.sunofbeach.taobao.response.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SearchService {


    @Autowired
    private API api;


    public SearchResult doSearch(String keyword, long page) {
        try {
            SearchResult searchResult = getSearchResult(keyword, page);
            if (searchResult.getTbk_dg_material_optional_response() == null) {
                searchResult = getSearchResult(keyword, page);
            }
            return searchResult;
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return null;
    }

    private SearchResult getSearchResult(String keyword, long page) throws ApiException {
        String result = api.getSearchContent(keyword, page);
        //System.out.println(result);
        Gson gson = new Gson();
        return gson.fromJson(result, SearchResult.class);
    }

    public R getTbSearchRecommend() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("iPhone");
        arrayList.add("小米手机");
        arrayList.add("口红");
        arrayList.add("CPU");
        arrayList.add("台式机");
        arrayList.add("笔记本");
        arrayList.add("特斯拉手机架");
        arrayList.add("随车充");
        arrayList.add("冬衣");
        arrayList.add("零食");
        return R.SUCCESS("获取推荐成功").setData(arrayList);
    }
}
