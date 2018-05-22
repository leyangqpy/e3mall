package cn.e3mall.search.service;

import cn.e3mall.common.pojo.SearchResult;

/**
 * Created by qianpyn on 2018/5/16.
 */
public interface SearchService {
    SearchResult search(String keyword, int page, int rows)throws Exception;
}
