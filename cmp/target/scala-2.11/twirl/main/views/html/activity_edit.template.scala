
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object activity_edit_Scope0 {
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

class activity_edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.pages.ActivityEditPage,play.twirl.api.HtmlFormat.Appendable] {

  /**
Required values:
class ActivityEditPage:
    Student user
    String title
    Activity activity;
**/
  def apply/*9.2*/(page: models.pages.ActivityEditPage):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*9.39*/("""
"""),_display_(/*10.2*/main_templete(page.user.studentName)/*10.38*/(page.title)/*10.50*/ {_display_(Seq[Any](format.raw/*10.52*/("""
      """),format.raw/*11.7*/("""<script>
	    $(document).ready(function()"""),format.raw/*12.34*/("""{"""),format.raw/*12.35*/("""
		    """),format.raw/*13.7*/("""counter = new function Counter() """),format.raw/*13.40*/("""{"""),format.raw/*13.41*/("""
                """),format.raw/*14.17*/("""this.count = 1;
				this.add = function() """),format.raw/*15.27*/("""{"""),format.raw/*15.28*/("""
					"""),format.raw/*16.6*/("""this.count++;
				"""),format.raw/*17.5*/("""}"""),format.raw/*17.6*/(""";
				this.reduce = function() """),format.raw/*18.30*/("""{"""),format.raw/*18.31*/("""
				    """),format.raw/*19.9*/("""this.count--;
				"""),format.raw/*20.5*/("""}"""),format.raw/*20.6*/(""";
				this.reset = function() """),format.raw/*21.29*/("""{"""),format.raw/*21.30*/("""
				    """),format.raw/*22.9*/("""this.count = 0;
				"""),format.raw/*23.5*/("""}"""),format.raw/*23.6*/(""";
			"""),format.raw/*24.4*/("""}"""),format.raw/*24.5*/(""";
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/(""");
	  </script>
      <div>
        <input placeholder="活动名称" id="input-name" type="text" class="validate">
        <label for="first_name">title</label>
      </div>
      <div id="activity-events">
          <h3> 事件 </h3>
          <div id="event-1" class="card darken-1">
		  <div class="input-field">
		    <input id="event-1-title" class="validate" type="text" placeholder="标题" />
			<label for="event-1-input-title"></label>
		  </div>
		  <div class="input-field">
            <input id="event-1-input-startdte" class="validate datepicker" type="date" placeholder="开始时间" required="required" />
			<label for="event-1-input-startdate"></label>
		  </div>
		  <div class="input-field">
            <input id="event-1-input-enddate" class="validate datepicker" type="date" placeholder="结束时间" required="required" />
			<label for="event-1-input-enddate"></label>
		  </div>
		  <div class="input-field">
 		    <textarea placeholder="事件描述" id="event-1-text-input" class= "materialize-textarea" oninput="this.editor.update()"></textarea>
		    <label for="event-1-text-input"></label>
	      </div>
		</div>
      </div>
      <div class="divider"> </div>
	  <div class="input-field">
        <textarea id="activity-description" class= "materialize-textarea" oninput="this.editor.update()"rows="6" cols="60">请填写 **内容** </textarea>
		<label for="activity-description"></label>
	  </div>
    <div class="divider"> </div>
    <div id="preview" class="section"> </div>
    <button id="submit" class="btn waves-effect waves-light" type="submit" name="action">
      提交<i class="material-icons right">send</i> 
    </button>
""")))}/*62.2*/ {_display_(Seq[Any](format.raw/*62.4*/("""

""")))}))
      }
    }
  }

  def render(page:models.pages.ActivityEditPage): play.twirl.api.HtmlFormat.Appendable = apply(page)

  def f:((models.pages.ActivityEditPage) => play.twirl.api.HtmlFormat.Appendable) = (page) => apply(page)

  def ref: this.type = this

}


}

/**
Required values:
class ActivityEditPage:
    Student user
    String title
    Activity activity;
**/
object activity_edit extends activity_edit_Scope0.activity_edit
              /*
                  -- GENERATED --
                  DATE: Mon Jun 19 10:44:55 CST 2017
                  SOURCE: E:/git_repos/Community-Management-Platform/cmp/app/views/activity_edit.scala.html
                  HASH: 9d532558e640e5b097a8b1013dec1593ec285e45
                  MATRIX: 891->116|1023->153|1052->156|1097->192|1118->204|1158->206|1193->214|1264->257|1293->258|1328->266|1389->299|1418->300|1464->318|1535->361|1564->362|1598->369|1644->388|1672->389|1732->421|1761->422|1798->432|1844->451|1872->452|1931->483|1960->484|1997->494|2045->515|2073->516|2106->522|2134->523|2172->534|2201->535|3878->2194|3917->2196
                  LINES: 33->9|38->9|39->10|39->10|39->10|39->10|40->11|41->12|41->12|42->13|42->13|42->13|43->14|44->15|44->15|45->16|46->17|46->17|47->18|47->18|48->19|49->20|49->20|50->21|50->21|51->22|52->23|52->23|53->24|53->24|54->25|54->25|91->62|91->62
                  -- GENERATED --
              */
          