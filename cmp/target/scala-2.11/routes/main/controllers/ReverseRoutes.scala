
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/git_repos/Community-Management-Platform/cmp/conf/routes
// @DATE:Mon Jun 19 09:20:52 CST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:44
  class ReverseCommunityManagementPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def showPage(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "communities/" + implicitly[PathBindable[Int]].unbind("id", id) + "/manage")
    }
  
  }

  // @LINE:22
  class ReverseHomePageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def showPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
  }

  // @LINE:7
  class ReverseLoginPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def showPage(): Call = {
    
      () match {
      
        // @LINE:7
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:19
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:57
  class ReverseMessageEditPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def showPage(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "messages/" + implicitly[PathBindable[Int]].unbind("id", id) + "/modify")
    }
  
    // @LINE:59
    def edit(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "messages/" + implicitly[PathBindable[Int]].unbind("id", id) + "/modify")
    }
  
  }

  // @LINE:47
  class ReverseCommunityEditPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def showPage(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "communities/" + implicitly[PathBindable[Int]].unbind("id", id) + "/modify")
    }
  
    // @LINE:50
    def edit(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "communities/" + implicitly[PathBindable[Int]].unbind("id", id) + "/modify")
    }
  
  }

  // @LINE:42
  class ReverseCommunityPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def showPage(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "communities/" + implicitly[PathBindable[Int]].unbind("id", id))
    }
  
  }

  // @LINE:40
  class ReverseCommunityListPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def showPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "communities/list")
    }
  
  }

  // @LINE:27
  class ReverseActivityPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def showPage(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "activities/" + implicitly[PathBindable[Int]].unbind("id", id))
    }
  
  }

  // @LINE:33
  class ReverseActivityEditPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def showPage(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "activities/" + implicitly[PathBindable[Int]].unbind("id", id) + "/modify")
    }
  
    // @LINE:35
    def edit(id:Int): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "activities/" + implicitly[PathBindable[Int]].unbind("id", id) + "/modify")
    }
  
  }

  // @LINE:30
  class ReverseActivityListPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def showPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "activities/list")
    }
  
  }

  // @LINE:55
  class ReverseMessageListPageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def showPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "massages/list")
    }
  
  }


}
