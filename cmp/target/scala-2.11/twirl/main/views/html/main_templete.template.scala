
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_templete_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main_templete extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,String,Html,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user_name: String)(title: String, stylesheets: Html = Html(""), scripts: Html = Html(""))(content: Html)(navibar: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.122*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>

<head>
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <meta http-equiv="Content-Security-Policy" content="script-src 'self'; style-src 'self' fonts.googleapis.com" />
  <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
  <link rel="stylesheet" href=""""),_display_(/*9.33*/controllers/*9.44*/.routes.Assets.versioned("materialize/css/materialize.min.css")),format.raw/*9.107*/("""" /> 
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
  """),_display_(/*11.4*/stylesheets),format.raw/*11.15*/("""
"""),format.raw/*12.1*/("""</head>

<body bgcolor="#fafafa">
  <!-- header and sidebar -->
  <header id="header">
    <div class="card-panel teal lighten-2 row">
      <div class="col s1">
        <ul id="slide-out" class="side-nav">
          <li>
            <div class="userView">
              <div class="background"> <a herf=""""),_display_(/*22.50*/routes/*22.56*/.HomePageController.showPage()),format.raw/*22.86*/(""""><img src=""""),_display_(/*22.99*/controllers/*22.110*/.routes.Assets.versioned("images/navitop.jpg")),format.raw/*22.156*/(""""></a> </div>
              <span class="white-text name"><h4>欢迎，"""),_display_(/*23.53*/user_name),format.raw/*23.62*/("""</h4></span>
            </div>
          </li>
          <li><a href=""""),_display_(/*26.25*/routes/*26.31*/.HomePageController.showPage()),format.raw/*26.61*/("""" class="side-nav-item">主页</a></li>
          <li><a href=""""),_display_(/*27.25*/routes/*27.31*/.CommunityListPageController.showPage()),format.raw/*27.70*/("""" class="side-nav-item"> 社团列表 </a></li>
          <li><a href=""""),_display_(/*28.25*/routes/*28.31*/.MessageListPageController.showPage()),format.raw/*28.68*/("""" class="side-nav-item"> 消息 </a></li>
        </ul>
        <a href="#" data-activates="slide-out" class="button-collapse"><i class="material-icons">menu</i></a>
      </div>
      <div class="col s11"> <h3 class="center-align white-text">"""),_display_(/*32.66*/title),format.raw/*32.71*/("""</h3> </div>
    </div>
  </header>

  <!-- main content -->
  <main id="body" class="row">
    <div id="content"> 
      <div class="row">
        <div id="content" class="col s9"> """),_display_(/*40.44*/content),format.raw/*40.51*/(""" """),format.raw/*40.52*/("""</div>
        <div id="navibar" class="col s3"> """),_display_(/*41.44*/navibar),format.raw/*41.51*/(""" """),format.raw/*41.52*/("""</div>
      </div>
    </div>
  </main>

  <!-- footer -->
  <footer id="footer" class="card-panel teal lighten-2 row">
    <div class="container">
      <div class="row">
        <div class="col l6 s12">
          <p class="white-text">社团管理软件</p>
          <hr />
          <p class="white-text"></p>
        </div>
      </div>
  </footer>
     <!-- scripts -->
  <script type="text/javascript" src=""""),_display_(/*58.40*/controllers/*58.51*/.routes.Assets.versioned("javascripts/jquery-3.2.1.min.js")),format.raw/*58.110*/(""""> </script>
  <script type="text/javascript" src=""""),_display_(/*59.40*/controllers/*59.51*/.routes.Assets.versioned("materialize/js/materialize.min.js")),format.raw/*59.112*/(""""> </script>
  <script type="text/javascript" src=""""),_display_(/*60.40*/controllers/*60.51*/.routes.Assets.versioned("javascripts/init.js")),format.raw/*60.98*/(""""> </script>
  <script type="text/javascript" src=""""),_display_(/*61.40*/controllers/*61.51*/.routes.Assets.versioned("md2html/lib/markdown.js")),format.raw/*61.102*/("""" > </script> 
  <script type="text/javascript" src=""""),_display_(/*62.40*/controllers/*62.51*/.routes.Assets.versioned("javascripts/md2html-init.js")),format.raw/*62.106*/("""" /> </script>
</body>
</html>"""))
      }
    }
  }

  def render(user_name:String,title:String,stylesheets:Html,scripts:Html,content:Html,navibar:Html): play.twirl.api.HtmlFormat.Appendable = apply(user_name)(title,stylesheets,scripts)(content)(navibar)

  def f:((String) => (String,Html,Html) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (user_name) => (title,stylesheets,scripts) => (content) => (navibar) => apply(user_name)(title,stylesheets,scripts)(content)(navibar)

  def ref: this.type = this

}


}

/**/
object main_templete extends main_templete_Scope0.main_templete
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 10:23:18 CST 2017
                  SOURCE: E:/git_repos/Community-Management-Platform/cmp/app/views/main_templete.scala.html
                  HASH: d98e55c47a29a4d123b32a42c26f7a175f363d8e
                  MATRIX: 788->1|1004->121|1032->123|1389->454|1408->465|1492->528|1620->630|1652->641|1681->643|2024->959|2039->965|2090->995|2130->1008|2151->1019|2219->1065|2313->1132|2343->1141|2445->1216|2460->1222|2511->1252|2599->1313|2614->1319|2674->1358|2766->1423|2781->1429|2839->1466|3110->1710|3136->1715|3354->1906|3382->1913|3411->1914|3489->1965|3517->1972|3546->1973|3994->2394|4014->2405|4095->2464|4175->2517|4195->2528|4278->2589|4358->2642|4378->2653|4446->2700|4526->2753|4546->2764|4619->2815|4701->2870|4721->2881|4798->2936
                  LINES: 27->1|32->1|33->2|40->9|40->9|40->9|42->11|42->11|43->12|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|63->32|63->32|71->40|71->40|71->40|72->41|72->41|72->41|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62
                  -- GENERATED --
              */
          