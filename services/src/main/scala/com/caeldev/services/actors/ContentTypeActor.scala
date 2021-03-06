package com.caeldev.services.actors

import akka.actor.{ActorLogging, Actor}
import com.caeldev.services.{PageQuery, ContentTypeServiceRegistry}
import com.caeldev.domain.ContentType
import com.caeldev.services.Operation.{Get, Update, Delete, Add}

/**
 * Copyright (c) 2012 - 2013 Caeldev, Inc.
 *
 * User: cael
 * Date: 17/10/2013
 * Time: 15:53
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
class ContentTypeActor extends Actor with ActorLogging {

  val contentTypeService = ContentTypeServiceRegistry.contentTypeService

  def receive = {
    case List(pageQuery:PageQuery) => {
      log.debug("Entering GetContents Method Actor")
      sender ! contentTypeService.list(pageQuery)
    }
    case Add(contentType:ContentType) => {
      log.debug("Entering Add Method Actor")
      sender ! contentTypeService.add(contentType)
    }
    case Delete(id:Long) => {
      log.debug("Entering Delete Method Actor")
      sender ! contentTypeService.delete(id)
    }
    case Update(contentType:ContentType) => {
      log.debug("Entering Update Method Actor")
      sender ! contentTypeService.update(contentType)
    }
    case Get(id:Long) => {
      log.debug("Entering Get Method Actor")
      sender ! contentTypeService.get(id)
    }
  }
}