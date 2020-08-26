package com.ruoyi.admin.mapper;

import java.util.List;
import com.ruoyi.admin.domain.OrderTest;

/**
 * 自己测试使用Mapper接口
 * 
 * @author admin_lz
 * @date 2020-08-10
 */
public interface OrderTestMapper 
{
    /**
     * 查询自己测试使用
     * 
     * @param id 自己测试使用ID
     * @return 自己测试使用
     */
    public OrderTest selectOrderTestById(Long id);

    /**
     * 查询自己测试使用列表
     * 
     * @param orderTest 自己测试使用
     * @return 自己测试使用集合
     */
    public List<OrderTest> selectOrderTestList(OrderTest orderTest);

    /**
     * 新增自己测试使用
     * 
     * @param orderTest 自己测试使用
     * @return 结果
     */
    public int insertOrderTest(OrderTest orderTest);

    /**
     * 修改自己测试使用
     * 
     * @param orderTest 自己测试使用
     * @return 结果
     */
    public int updateOrderTest(OrderTest orderTest);

    /**
     * 删除自己测试使用
     * 
     * @param id 自己测试使用ID
     * @return 结果
     */
    public int deleteOrderTestById(Long id);

    /**
     * 批量删除自己测试使用
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOrderTestByIds(Long[] ids);
}
