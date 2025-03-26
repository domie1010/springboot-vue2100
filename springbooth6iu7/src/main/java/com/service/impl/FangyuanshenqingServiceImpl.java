package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FangyuanshenqingDao;
import com.entity.FangyuanshenqingEntity;
import com.service.FangyuanshenqingService;
import com.entity.vo.FangyuanshenqingVO;
import com.entity.view.FangyuanshenqingView;

@Service("fangyuanshenqingService")
public class FangyuanshenqingServiceImpl extends ServiceImpl<FangyuanshenqingDao, FangyuanshenqingEntity> implements FangyuanshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangyuanshenqingEntity> page = this.selectPage(
                new Query<FangyuanshenqingEntity>(params).getPage(),
                new EntityWrapper<FangyuanshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangyuanshenqingEntity> wrapper) {
		  Page<FangyuanshenqingView> page =new Query<FangyuanshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangyuanshenqingVO> selectListVO(Wrapper<FangyuanshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangyuanshenqingVO selectVO(Wrapper<FangyuanshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangyuanshenqingView> selectListView(Wrapper<FangyuanshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangyuanshenqingView selectView(Wrapper<FangyuanshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
