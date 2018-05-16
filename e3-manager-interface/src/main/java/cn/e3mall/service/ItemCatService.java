package cn.e3mall.service;

import cn.e3mall.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * Created by qianpyn on 2018/4/12.
 */
public interface ItemCatService {
    List<EasyUITreeNode> getItemCatList(long parentId);
}
