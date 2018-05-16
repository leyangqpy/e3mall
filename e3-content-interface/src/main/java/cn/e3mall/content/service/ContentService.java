package cn.e3mall.content.service;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import cn.e3mall.common.util.E3Result;
import cn.e3mall.pojo.TbContent;

import java.util.List;

/**
 * Created by qianpyn on 2018/5/10.
 */
public interface ContentService {

    EasyUIDataGridResult getContentList(Integer page, Integer rows);

    E3Result addContent(TbContent content);

    List<TbContent> getContentListByCid(long cid);
}
