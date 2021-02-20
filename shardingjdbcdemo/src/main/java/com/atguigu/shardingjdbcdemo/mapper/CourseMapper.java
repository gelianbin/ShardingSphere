package com.atguigu.shardingjdbcdemo.mapper;

import com.atguigu.shardingjdbcdemo.entity.Course;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

//该注解，把mapper交给spring管理
@Repository
public interface CourseMapper extends BaseMapper<Course> {

}
