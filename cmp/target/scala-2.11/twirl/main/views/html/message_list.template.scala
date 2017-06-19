
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object message_list_Scope0 {
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

class message_list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.pages.MessageListPage,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(page: models.pages.MessageListPage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*14.2*/pagination/*14.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.16*/("""
  """),format.raw/*15.3*/("""<ul class="pagination">
    <li class="disabled"><a href="#!"><i class="material-icons small">chevron_left</i></a></li>
    <li class="active"><a href="#!">1</a></li>
    <li class="waves-effect"><a href="#!">2</a></li>
    <li class="waves-effect"><a href="#!">3</a></li>
    <li class="waves-effect"><a href="#!">4</a></li>
    <li class="waves-effect"><a href="#!">5</a></li>
    <li class="waves-effect"><a href="#!"><i class="material-icons">chevron_right</i></a></li>
  </ul>
""")))};def /*26.2*/srcipts/*26.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*26.13*/("""
    """),format.raw/*27.5*/("""<script lang="javascript">
    </script>
""")))};def /*31.2*/messagePanel/*31.14*/(messages: List[Message]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*31.43*/("""
  """),format.raw/*32.3*/("""<h3> 消息 </h3>
  """),_display_(/*33.4*/pagination),format.raw/*33.14*/("""
  """),format.raw/*34.3*/("""<div class="divider"></div>
  """),_display_(/*35.4*/for(massage <- messages) yield /*35.28*/ {_display_(Seq[Any](format.raw/*35.30*/("""
    """),format.raw/*36.5*/("""<div class="section">
      <h4> massage.title </h4>
      <p> massage.content </p>
      <div class="divider"></div>
    </div>
  """)))}),format.raw/*41.4*/("""
  """),format.raw/*42.3*/("""<div class="divider"></div>
  """),_display_(/*43.4*/pagination),format.raw/*43.14*/("""
""")))};
Seq[Any](format.raw/*1.38*/(""" 
"""),format.raw/*9.4*/("""



"""),format.raw/*13.1*/("""<!-- TODO -->
"""),format.raw/*24.2*/("""

"""),format.raw/*29.2*/("""

"""),format.raw/*44.2*/("""

"""),_display_(/*46.2*/main_templete(page.user.studentName)/*46.38*/(page.title)/*46.50*/ {_display_(Seq[Any](format.raw/*46.52*/("""
    """),_display_(/*47.6*/messagePanel(page.messages)),format.raw/*47.33*/("""
""")))}/*48.2*/ {_display_(Seq[Any](format.raw/*48.4*/("""

""")))}))
      }
    }
  }

  def render(page:models.pages.MessageListPage): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((models.pages.MessageListPage) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


}

/**/
object message_list extends message_list_Scope0.message_list
              /*
                  -- GENERATED --
                  DATE: Sun Jun 18 18:48:19 CST 2017
                  SOURCE: E:/git_repos/Community-Management-Platform/cmp/app/views/message_list.scala.html
                  HASH: fb70a98ae7c8c74efd2750630711280aca7e8ccf
                  MATRIX: 781->1|896->183|915->193|996->197|1027->201|1542->698|1557->705|1638->709|1671->715|1738->764|1759->776|1865->805|1896->809|1940->827|1971->837|2002->841|2060->873|2100->897|2140->899|2173->905|2340->1042|2371->1046|2429->1078|2460->1088|2502->37|2531->159|2566->167|2608->693|2639->759|2670->1091|2701->1096|2746->1132|2767->1144|2807->1146|2840->1153|2888->1180|2909->1183|2948->1185
                  LINES: 27->1|31->14|31->14|33->14|34->15|43->26|43->26|45->26|46->27|48->31|48->31|50->31|51->32|52->33|52->33|53->34|54->35|54->35|54->35|55->36|60->41|61->42|62->43|62->43|64->1|65->9|69->13|70->24|72->29|74->44|76->46|76->46|76->46|76->46|77->47|77->47|78->48|78->48
                  -- GENERATED --
              */
          