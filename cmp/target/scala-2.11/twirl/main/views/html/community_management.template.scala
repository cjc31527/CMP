
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object community_management_Scope0 {
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

class community_management extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.pages.CommunityManagementPage,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: models.pages.CommunityManagementPage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""
"""),format.raw/*7.79*/("""

"""),format.raw/*14.4*/("""



"""),_display_(/*18.2*/main_templete(page.user.studentName)/*18.38*/(page.title)/*18.50*/ {_display_(Seq[Any](format.raw/*18.52*/("""
    """),format.raw/*19.5*/("""<div id="member" class="community-management-content">
        <h3>成员</h3>
        <a href="#" class="btn-floating waves-effect waves-light cyan">
            <span class="grey-text"></span>
            <i class="material-icons pink">add</i>
        </a>
        <p>  </p>
    </div>

    <div id="activity" class="community-management-content">
        <h3> 活动 </h3>
        <a href="#" class="btn-floating waves-effect waves-light cyan">
            <i class="material-icons red">add</i>
            </a>
    </div>
    <div id="department" class="community-mamagement-content">
        <h3> 部门 </h3>
        <a href="#" class="btn-floating waves-effect waves-light cyan">
          <span class="grey-text"></span>
          <i class="material-icons red">add</i>
        </a>
    </div>
    <div id="message" class="community-management-content">
        <h3> 消息 </h3>
        <a href="#" class="btn-floating waves-effect waves-light cyan"> <i class="material-icons">add</i> </a>
        <!-- ajax autogenerate table TODO -->
    </div>
""")))}/*46.2*/ {_display_(Seq[Any](format.raw/*46.4*/("""
    """),format.raw/*47.5*/("""<div class="col hide-on-small-only m3 l2">
     <ul class="section table-of-contents">
        <li><a href="#member"> 成员 </a></li>
        <li><a href="#activity"> 活动 </a></li>
        <li><a href="#department"> 部门 </a></li>
        <li><a href="#massage"> 消息 </a></li>
      </ul>
    </div>
""")))}))
      }
    }
  }

  def render(page:models.pages.CommunityManagementPage): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((models.pages.CommunityManagementPage) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


}

/**/
object community_management extends community_management_Scope0.community_management
              /*
                  -- GENERATED --
                  DATE: Sun Jun 18 19:54:31 CST 2017
                  SOURCE: E:/git_repos/Community-Management-Platform/cmp/app/views/community_management.scala.html
                  HASH: d7c39bb486afe7a64e8e84f9ff88973b7dd52836
                  MATRIX: 805->1|944->45|973->387|1004->487|1039->496|1084->532|1105->544|1145->546|1178->552|2263->1619|2302->1621|2335->1627
                  LINES: 27->1|32->1|33->7|35->14|39->18|39->18|39->18|39->18|40->19|67->46|67->46|68->47
                  -- GENERATED --
              */
          