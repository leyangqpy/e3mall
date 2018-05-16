package cn.e3mall.content.service;

import cn.e3mall.common.pojo.EasyUITreeNode;
import cn.e3mall.common.util.E3Result;

import java.util.List;

/**
 * Created by qianpyn on 2018/5/9.
 */
public interface ContentCategoryService {

    List<EasyUITreeNode> getContentCatList(long parentId);
    E3Result addContentCategory(long parentId, String name);
}
