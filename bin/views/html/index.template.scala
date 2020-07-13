
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!-- """),_display_(/*3.7*/main("Welcome to Play")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/(""" """),format.raw/*3.33*/("""-->
<!--   <h1>Welcome to Play!</h1> -->
<!-- """)))}),format.raw/*5.7*/(""" """),format.raw/*5.8*/("""-->

<html>
<head><title>All Users</title></head>
<body>
<h1>Welcome """),_display_(/*10.14*/name),format.raw/*10.18*/("""/h1>

</body>

</html>
"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-10T13:19:11.799261
                  SOURCE: /home/teju/Downloads/usermangement-play/app/views/index.scala.html
                  HASH: 820a9a88c01d1b22b3cc7c30cae1cc51b0201fce
                  MATRIX: 907->1|1015->16|1042->17|1073->23|1104->46|1143->48|1171->49|1247->96|1274->97|1371->167|1396->171
                  LINES: 27->1|32->2|33->3|33->3|33->3|33->3|33->3|35->5|35->5|40->10|40->10
                  -- GENERATED --
              */
          