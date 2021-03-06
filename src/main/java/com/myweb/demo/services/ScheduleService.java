/*
 * Copyright © 2015-2026 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * @since 0.0.1
 */

package com.myweb.demo.services;

import com.myweb.demo.dao.ScheduleDao;
import com.myweb.demo.dao.UserDao;
import com.myweb.demo.dbmodel.Schedule;
import com.myweb.demo.dbmodel.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <pre>
 *
 * </pre>
 *
 * @author wanzhibin
 * @since 1.0.0
 */
@Service
public class ScheduleService {


    private ScheduleDao scheduleDao;

    @Resource
    private UserDao userDao;

    public List<Schedule> queryAllSchedule(){
        return scheduleDao.queryAllSchedule();
    }

    public List<User> queryAllUser(){
        return userDao.queryAllUser();
    }
}
