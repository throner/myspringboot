/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/
package throner.myspringboot.tool.es.dsl.query.builder.filter;

import com.google.gson.JsonObject;

/**
 * A DSLQuery is an object that represent a DSL filter.
 *
 * The basic operation is to get it as a JSON.
 */
public interface DSLFilter {
    
    public final String CACHE = "_cache";
    public final String FIELD = "field";

    /**
     *
     * @return JsonObject that will perform this filter
     */
    public JsonObject getFilterAsJson();
}