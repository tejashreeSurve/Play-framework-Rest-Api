// @GENERATOR:play-routes-compiler
// @SOURCE:/home/teju/Downloads/usermangement-play/conf/routes
// @DATE:Thu Jul 16 17:25:01 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def saveUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addUser")
    }
  
    // @LINE:11
    def updateUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "edit")
    }
  
    // @LINE:8
    def addUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addUser")
    }
  
    // @LINE:10
    def editUser(userId:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("userId", userId)))
    }
  
    // @LINE:12
    def loginUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:13
    def signUp(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:7
    def getAllUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
