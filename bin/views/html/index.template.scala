
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
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!-- """),_display_(/*3.7*/main("Welcome to Play")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/(""" """),format.raw/*3.33*/("""-->
<!--   <h1>Welcome to Play!</h1> -->
<!-- """)))}),format.raw/*5.7*/(""" """),format.raw/*5.8*/("""-->

<html>
<head><title>All Users</title></head>
<body>
<h1>"""),_display_(/*10.6*/message),format.raw/*10.13*/("""</h1>

</body>

</html>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-15T13:03:18.422082
                  SOURCE: /home/teju/Downloads/usermangement-play/app/views/index.scala.html
                  HASH: b6f7599bf1b71758520447e9a92fa6a86468a656
                  MATRIX: 907->1|1018->19|1045->20|1076->26|1107->49|1146->51|1174->52|1250->99|1277->100|1365->162|1393->169
                  LINES: 27->1|32->2|33->3|33->3|33->3|33->3|33->3|35->5|35->5|40->10|40->10
                  -- GENERATED --
              */
          