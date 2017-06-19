
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.pages.HomePage,play.twirl.api.HtmlFormat.Appendable] {

  /***
Required values:
class HomePage:
  User user
  String title
  List[Activity] attentdedAtivites
  List[Activity] activityNodtifications
  List[Message] messages
***/
  def apply/*11.2*/(page: models.pages.HomePage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*11.31*/("""

"""),_display_(/*13.2*/main_templete(page.user.studentName)/*13.38*/(page.title)/*13.50*/ {_display_(Seq[Any](format.raw/*13.52*/("""
    """),format.raw/*14.5*/("""<div id="attended-ativities" class="section scrollspy">
      <p>
        <h3> 已参加的活动 </h3>
        <table>
          <thead>
            <tr>
              <td> 名称</td>
              <td> 开始时间 </td>
              <td> 结束时间 </td>
              <td> 更多 </td>
            </tr>
          </thead>
          <tbody>
            """),_display_(/*27.14*/for(ativitiy <- page.attendedActivites) yield /*27.53*/ {_display_(Seq[Any](format.raw/*27.55*/("""
              """),format.raw/*28.15*/("""<tr>
                <td> ativitiy.name </td>
                <td> ativitiy.startdate </td>
                <td> ativitiy.enddate </td>
                <td> <a href=""""),_display_(/*32.32*/routes/*32.38*/.ActivityPageController.showPage(ativitiy activityID)),format.raw/*32.91*/("""">更多</a> </td>
              </tr>
              """)))}),format.raw/*34.16*/("""
              """),format.raw/*35.15*/("""<a href=""""),_display_(/*35.25*/routes/*35.31*/.ActivityListPageController.showPage()),format.raw/*35.69*/("""">显示所有活动  </a>
          </tbody>
        </table>
      </p>
    </div>
    <div class="divider"></div>
    <div id="recent-activity-notifications" class="section scrollspy">
      <h3>活动推送 </h3>
      <p>
        """),_display_(/*44.10*/for(notification <- page.activityNotifications) yield /*44.57*/  {_display_(Seq[Any](format.raw/*44.60*/(""" 
          """),format.raw/*45.11*/("""<div class="a-activities-notification section">
          <h4> notification.title </h4>
          <ul class="collapsible popout" data-collapsible="accordion">
            <div class="collasible-header">介绍</div>
            <div class="collasible-body">
              <p>notification.content</p>
            </div>
          </ul>
          <ul class="collapsible popout" data-collapsible="accordion">
            <div class="collasible-header">时间?</div>
            <div class="collasible-body">
              <p>notification.time</p>
            </div>
          </ul>
          <ul class="collapsible popout" data-collapsible="accordion">
            <div class="collasible-header">地址</div>
            <div class="collasible-body">
              <p>notification.address</p>
            </div>
          </ul>
          <a href=""""),_display_(/*65.21*/routes/*65.27*/.ActivityPageController.showPage(notification.activityID)),format.raw/*65.84*/("""">更多</a>
        """)))}),format.raw/*66.10*/("""
    """),format.raw/*67.5*/("""</div>

    <div id="messages">
      <h3> 消息 </h3>
      """),_display_(/*71.8*/for(message <- page.messages) yield /*71.37*/ {_display_(Seq[Any](format.raw/*71.39*/(""" 
        """),format.raw/*72.9*/("""<p> message.content </p>
        <div class="divider"> </div>
        """)))}),format.raw/*74.10*/("""
    """),format.raw/*75.5*/("""</div>
  """)))}/*76.4*/ {_display_(Seq[Any](format.raw/*76.6*/("""
    """),format.raw/*77.5*/("""<ul class="section table-of-contents">
      <li><a href="#attended-ativities">已参加的活动</a></li>
      <li><a href="#recent-activity-notifications">最近活动推送</a></li>
      <li><a href="#messages">消息</a></li>
    </ul>
""")))}))
      }
    }
  }

  def render(page:models.pages.HomePage): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((models.pages.HomePage) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


}

/***
Required values:
class HomePage:
  User user
  String title
  List[Activity] attentdedAtivites
  List[Activity] activityNodtifications
  List[Message] messages
***/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Sun Jun 18 19:48:28 CST 2017
                  SOURCE: E:/git_repos/Community-Management-Platform/cmp/app/views/home.scala.html
                  HASH: a975ce535488dd25c3660df32e81f3cd57afa481
                  MATRIX: 932->182|1057->211|1088->216|1133->252|1154->264|1194->266|1227->272|1593->611|1648->650|1688->652|1732->668|1930->839|1945->845|2019->898|2102->950|2146->966|2183->976|2198->982|2257->1020|2509->1245|2572->1292|2613->1295|2654->1308|3533->2160|3548->2166|3626->2223|3676->2242|3709->2248|3798->2311|3843->2340|3883->2342|3921->2353|4025->2426|4058->2432|4087->2443|4126->2445|4159->2451
                  LINES: 35->11|40->11|42->13|42->13|42->13|42->13|43->14|56->27|56->27|56->27|57->28|61->32|61->32|61->32|63->34|64->35|64->35|64->35|64->35|73->44|73->44|73->44|74->45|94->65|94->65|94->65|95->66|96->67|100->71|100->71|100->71|101->72|103->74|104->75|105->76|105->76|106->77
                  -- GENERATED --
              */
          