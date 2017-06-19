
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object community_Scope0 {
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

class community extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.pages.CommunityPage,play.twirl.api.HtmlFormat.Appendable] {

  /**
Required values:
     Student user;
     String title;
     Community community;
**/
  def apply/*8.2*/(page: models.pages.CommunityPage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.36*/("""

"""),_display_(/*10.2*/main_templete(page.user.studentName)/*10.38*/(page.title)/*10.50*/ {_display_(Seq[Any](format.raw/*10.52*/("""
  """),format.raw/*11.3*/("""<html>
  <div class="section"> 
    <h2> """),_display_(/*13.11*/page/*13.15*/.community.communityName),format.raw/*13.39*/(""" """),format.raw/*13.40*/("""</h2>
    <h3> 简介 </h3>
    <p> """),_display_(/*15.10*/page/*15.14*/.community.description),format.raw/*15.36*/("""</p>
  </div>
  <div class="divider"> </div>
  <div class="section"> <p>
  </html>
""")))}/*20.2*/ {_display_(Seq[Any](format.raw/*20.4*/("""

""")))}))
      }
    }
  }

  def render(page:models.pages.CommunityPage): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((models.pages.CommunityPage) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


}

/**
Required values:
     Student user;
     String title;
     Community community;
**/
object community extends community_Scope0.community
              /*
                  -- GENERATED --
                  DATE: Sun Jun 18 19:39:46 CST 2017
                  SOURCE: E:/git_repos/Community-Management-Platform/cmp/app/views/community.scala.html
                  HASH: 0d661774ed9bc61d020b6c89241351d697d763ee
                  MATRIX: 862->98|991->132|1022->137|1067->173|1088->185|1128->187|1159->191|1230->235|1243->239|1288->263|1317->264|1379->299|1392->303|1435->325|1542->414|1581->416
                  LINES: 32->8|37->8|39->10|39->10|39->10|39->10|40->11|42->13|42->13|42->13|42->13|44->15|44->15|44->15|49->20|49->20
                  -- GENERATED --
              */
          