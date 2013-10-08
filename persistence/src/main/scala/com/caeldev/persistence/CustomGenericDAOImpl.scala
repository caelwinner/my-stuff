package com.caeldev.persistence

import com.googlecode.genericdao.dao.jpa.GenericDAOImpl

/**
 * Copyright (c) 2012 - 2013 Caeldev, Inc.
 *
 * User: cael
 * Date: 08/10/2013
 * Time: 11:20
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
class CustomGenericDAOImpl[T, ID <: Serializable] extends GenericDAOImpl[T, ID] {

  val entityMgt = DaoRegistry.entityManager

  def beginTransaction {
    entityMgt.getTransaction.begin
  }

  def commit {
    entityMgt.getTransaction.commit
  }

  def rollback {
    entityMgt.getTransaction.rollback
  }

  setEntityManager(DaoRegistry.entityManager)
  setSearchProcessor(DaoRegistry.searchProcessor)

}
