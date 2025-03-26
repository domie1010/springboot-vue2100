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


import com.dao.ZhufangfenpeiDao;
import com.entity.ZhufangfenpeiEntity;
import com.service.ZhufangfenpeiService;
import com.entity.vo.ZhufangfenpeiVO;
import com.entity.view.ZhufangfenpeiView;

@Service("zhufangfenpeiService")
public class ZhufangfenpeiServiceImpl extends ServiceImpl<ZhufangfenpeiDao, ZhufangfenpeiEntity> implements ZhufangfenpeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhufangfenpeiEntity> page = this.selectPage(
                new Query<ZhufangfenpeiEntity>(params).getPage(),
                new EntityWrapper<ZhufangfenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhufangfenpeiEntity> wrapper) {
		  Page<ZhufangfenpeiView> page =new Query<ZhufangfenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhufangfenpeiVO> selectListVO(Wrapper<ZhufangfenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhufangfenpeiVO selectVO(Wrapper<ZhufangfenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhufangfenpeiView> selectListView(Wrapper<ZhufangfenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhufangfenpeiView selectView(Wrapper<ZhufangfenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
