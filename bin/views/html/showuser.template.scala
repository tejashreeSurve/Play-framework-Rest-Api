
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

object showuser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userData : List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
<head>
<title>All User</title>
</head>

<body>

<h1>All User</h1>

"""),_display_(/*12.2*/for(user <- userData) yield /*12.23*/{_display_(Seq[Any](format.raw/*12.24*/("""
"""),format.raw/*13.1*/("""<a href=#><h2>User-"""),_display_(/*13.21*/user/*13.25*/.getUserId),format.raw/*13.35*/("""</h2></a>
<h3><p> Name :- """),_display_(/*14.18*/user/*14.22*/.fName),format.raw/*14.28*/(""" """),_display_(/*14.30*/user/*14.34*/.mName),format.raw/*14.40*/(""" """),_display_(/*14.42*/user/*14.46*/.lName),format.raw/*14.52*/(""" """),format.raw/*14.53*/("""</p></h3>
<h3><p> Email :- """),_display_(/*15.19*/user/*15.23*/.userEmail),format.raw/*15.33*/(""" """),format.raw/*15.34*/("""</p></h3>
<h3><p> Password :- """),_display_(/*16.22*/user/*16.26*/.password),format.raw/*16.35*/(""" """),format.raw/*16.36*/("""</p></h3>
""")))}),format.raw/*17.2*/("""
"""),format.raw/*18.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(userData:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(userData)

  def f:((List[User]) => play.twirl.api.HtmlFormat.Appendable) = (userData) => apply(userData)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-14T17:57:09.865876
                  SOURCE: /home/teju/Downloads/usermangement-play/app/views/showuser.scala.html
                  HASH: 8bd4ce9ea9de82688472d015365c353f82cb313f
                  MATRIX: 914->1|1031->25|1058->26|1159->101|1196->122|1235->123|1263->124|1310->144|1323->148|1354->158|1408->185|1421->189|1448->195|1477->197|1490->201|1517->207|1546->209|1559->213|1586->219|1615->220|1670->248|1683->252|1714->262|1743->263|1801->294|1814->298|1844->307|1873->308|1914->319|1942->320
                  LINES: 27->1|32->2|33->3|42->12|42->12|42->12|43->13|43->13|43->13|43->13|44->14|44->14|44->14|44->14|44->14|44->14|44->14|44->14|44->14|44->14|45->15|45->15|45->15|45->15|46->16|46->16|46->16|46->16|47->17|48->18
                  -- GENERATED --
              */
          