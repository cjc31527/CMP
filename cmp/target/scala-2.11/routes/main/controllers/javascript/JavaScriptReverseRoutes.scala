
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/git_repos/Community-Management-Platform/cmp/conf/routes
// @DATE:Mon Jun 19 09:20:52 CST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:44
  class ReverseCommunityManagementPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def showPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityManagementPageController.showPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "communities/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0) + "/manage"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseHomePageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def showPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomePageController.showPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseLoginPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def showPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginPageController.showPage",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
        }
      """
    )
  
    // @LINE:19
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginPageController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:57
  class ReverseMessageEditPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def showPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageEditPageController.showPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "messages/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0) + "/modify"})
        }
      """
    )
  
    // @LINE:59
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageEditPageController.edit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "messages/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0) + "/modify"})
        }
      """
    )
  
  }

  // @LINE:47
  class ReverseCommunityEditPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def showPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityEditPageController.showPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "communities/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0) + "/modify"})
        }
      """
    )
  
    // @LINE:50
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityEditPageController.edit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "communities/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0) + "/modify"})
        }
      """
    )
  
  }

  // @LINE:42
  class ReverseCommunityPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def showPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityPageController.showPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "communities/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseCommunityListPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def showPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommunityListPageController.showPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "communities/list"})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseActivityPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def showPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActivityPageController.showPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activities/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:33
  class ReverseActivityEditPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def showPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActivityEditPageController.showPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activities/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0) + "/modify"})
        }
      """
    )
  
    // @LINE:35
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActivityEditPageController.edit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "activities/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0) + "/modify"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseActivityListPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def showPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActivityListPageController.showPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activities/list"})
        }
      """
    )
  
  }

  // @LINE:55
  class ReverseMessageListPageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def showPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MessageListPageController.showPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "massages/list"})
        }
      """
    )
  
  }


}
