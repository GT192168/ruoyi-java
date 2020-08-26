package com.ruoyi.admin.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.admin.mapper.OrderTestMapper;
import com.ruoyi.admin.domain.OrderTest;
import com.ruoyi.admin.service.IOrderTestService;

/**
 * 自己测试使用Service业务层处理
 * 
 * @author admin_lz
 * @date 2020-08-10
 */
@Service
public class OrderTestServiceImpl implements IOrderTestService 
{
    @Autowired
    private OrderTestMapper orderTestMapper;

    /**
     * 查询自己测试使用
     * 
     * @param id 自己测试使用ID
     * @return 自己测试使用
     */
    @Override
    public OrderTest selectOrderTestById(Long id)
    {
        return orderTestMapper.selectOrderTestById(id);
    }

    /**
     * 查询自己测试使用列表
     * 
     * @param orderTest 自己测试使用
     * @return 自己测试使用
     */
    @Override
    public List<OrderTest> selectOrderTestList(OrderTest orderTest)
    {
        return orderTestMapper.selectOrderTestList(orderTest);
    }

    /**
     * 新增自己测试使用
     * 
     * @param orderTest 自己测试使用
     * @return 结果
     */
    @Override
    public int insertOrderTest(OrderTest orderTest)
    {
        return orderTestMapper.insertOrderTest(orderTest);
    }

    /**
     * 修改自己测试使用
     *
     * 
     * @param orderTest 自己测试使用
     * @return 结果
     */
    @Override
    public int updateOrderTest(OrderTest orderTest)
    {
        return orderTestMapper.updateOrderTest(orderTest);
    }

    /**
     * 批量删除自己测试使用
     * 
     * @param ids 需要删除的自己测试使用ID
     * @return 结果
     */
    @Override
    public int deleteOrderTestByIds(Long[] ids)
    {
        return orderTestMapper.deleteOrderTestByIds(ids);
    }

    /**
     * 删除自己测试使用信息
     * 
     * @param id 自己测试使用ID
     * @return 结果
     */
    @Override
    public int deleteOrderTestById(Long id)
    {
        return orderTestMapper.deleteOrderTestById(id);
    }
}
