package com.ruoyi.web.controller.ordertest;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.admin.domain.OrderTest;
import com.ruoyi.admin.service.IOrderTestService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 自己测试使用Controller
 * 
 * @author admin_lz
 * @date 2020-08-10
 */
@RestController
@RequestMapping("/admin/test")
public class OrderTestController extends BaseController
{
    @Autowired
    private IOrderTestService orderTestService;

    /**
     * 查询自己测试使用列表
     */
    @PreAuthorize("@ss.hasPermi('admin:test:list')")
    @GetMapping("/list")
    public TableDataInfo list(OrderTest orderTest)
    {
        startPage();
        List<OrderTest> list = orderTestService.selectOrderTestList(orderTest);
        return getDataTable(list);
    }

    /**
     * 导出自己测试使用列表
     */
    @PreAuthorize("@ss.hasPermi('admin:test:export')")
    @Log(title = "自己测试使用", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(OrderTest orderTest)
    {
        List<OrderTest> list = orderTestService.selectOrderTestList(orderTest);
        ExcelUtil<OrderTest> util = new ExcelUtil<OrderTest>(OrderTest.class);
        return util.exportExcel(list, "test");
    }

    /**
     * 获取自己测试使用详细信息
     */
    @PreAuthorize("@ss.hasPermi('admin:test:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(orderTestService.selectOrderTestById(id));
    }

    /**
     * 新增自己测试使用
     */
    @PreAuthorize("@ss.hasPermi('admin:test:add')")
    @Log(title = "自己测试使用", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OrderTest orderTest)
    {
        return toAjax(orderTestService.insertOrderTest(orderTest));
    }

    /**
     * 修改自己测试使用
     */
    @PreAuthorize("@ss.hasPermi('admin:test:edit')")
    @Log(title = "自己测试使用", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OrderTest orderTest)
    {
        return toAjax(orderTestService.updateOrderTest(orderTest));
    }

    /**
     * 删除自己测试使用
     */
    @PreAuthorize("@ss.hasPermi('admin:test:remove')")
    @Log(title = "自己测试使用", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(orderTestService.deleteOrderTestByIds(ids));
    }
}
