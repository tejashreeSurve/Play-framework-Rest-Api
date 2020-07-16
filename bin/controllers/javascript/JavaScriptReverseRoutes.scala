// @GENERATOR:play-routes-compiler
// @SOURCE:/home/teju/Downloads/usermangement-play/conf/routes
// @DATE:Thu Jul 16 17:25:01 IST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def saveUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.saveUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser"})
        }
      """
    )
  
    // @LINE:11
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edit"})
        }
      """
    )
  
    // @LINE:8
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser"})
        }
      """
    )
  
    // @LINE:10
    def editUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.editUser",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:12
    def loginUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loginUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:13
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signUp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:7
    def getAllUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getAllUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
