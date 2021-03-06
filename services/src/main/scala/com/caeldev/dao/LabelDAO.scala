package com.caeldev.dao

import com.googlecode.genericdao.dao.jpa.GenericDAO
import com.caeldev.domain.Label
import com.caeldev.persistence.CustomGenericDAOImpl

/**
 * Copyright (c) 2012 - 2013 Caeldev, Inc.
 *
 * User: cael
 * Date: 07/10/2013
 * Time: 16:51
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

trait LabelDAOComponent {
  val labelDao: LabelDAO

  trait LabelDAO extends GenericDAO[Label, java.lang.Long]
}

trait LabelDAOComponentLive extends LabelDAOComponent {
  class LabelDAOImpl extends CustomGenericDAOImpl[Label, java.lang.Long] with LabelDAO
}