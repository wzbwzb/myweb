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

package com.myweb.demo.dbmodel;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * <pre>
 *
 * </pre>
 *
 * @author wanzhibin
 * @since 1.0.0
 */
@Data
@Table(name = "TUSER")
public class User {

    @Id
    @Column(name = "ID")
    private Integer id;


    @Column(name = "NAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String password;
}
