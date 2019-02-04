import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_racetrack_raceindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/race/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',14,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',14,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(2)
loop:{
int i = 0
for( raceInstance in (raceInstanceList) ) {
printHtmlPart(8)
expressionOut.print(raceInstance.name)
printHtmlPart(9)
expressionOut.print(raceInstance.startDate.
                            format("EEEE, MMMM d, yyyy"))
printHtmlPart(10)
expressionOut.print(raceInstance.city)
printHtmlPart(11)
expressionOut.print(raceInstance.state)
printHtmlPart(12)
invokeTag('formatNumber','g',40,['number':(raceInstance.distance),'format':("0 K")],-1)
printHtmlPart(13)
invokeTag('formatNumber','g',47,['number':(raceInstance.cost),'format':("\$###,##0")],-1)
printHtmlPart(14)
i++
}
}
printHtmlPart(15)
invokeTag('paginate','g',52,['total':("${raceInstanceTotalCount}Count?:0")],-1)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',53,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1548328873000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
