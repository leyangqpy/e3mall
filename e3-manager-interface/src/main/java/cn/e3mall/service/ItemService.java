package cn.e3mall.service;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.common.util.E3Result;

/**
 * Created by qianpyn on 2018/4/9.
 */
public interface ItemService {
    TbItem getItemById(long itemId);

    EasyUIDataGridResult getItemList(int page,int rows);

    E3Result addItem(TbItem tbItem,String desc);

}
