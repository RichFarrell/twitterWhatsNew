<#-- @ftlvariable name="" type="com.richfarrelldev.twitterWhatsNew.twitterSearchView" -->

<html>

  <head>
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/styles.css" />
  	<script data-main="/js/common" src="/lib/require.js"></script>
  	
  </head>

  <body style="margin:25px">
    <div class="page-header">
        <h2>Twitter Feed <small>@Salesforce</small></h2>
    </div>
    
    <div class="timeline">
    	<!-- Line component -->
        <div class="line text-muted"></div>
        <div id="twitterList" class="timeline"></div>
    </div>
    
    <script type="text/template" id="template_twitter">
	    <article class="panel panel-primary">
	    
	        <!-- Icon -->
	        <div class="panel-heading icon">
	            <i class="glyphicon glyphicon-plus"></i>
	        </div>
	        <!-- /Icon -->
	
	        <!-- Heading -->
	        <div class="panel-heading">
	            <h2 class="panel-title"><%=user.name%> <small>@<%=user.screenName%></small></h2>
	        </div>
	        <!-- /Heading -->
	
	        <!-- Body -->
	        <div class="panel-body">
	        	<div class="avatar"><img src="<%=user.profileImageURL%>"></div>
	            <%=text%>
	        </div>
	        <!-- /Body -->
	
	        <!-- Footer -->
	        <div class="panel-footer">
	            <small><%=createdAt%> Retweets: <%=retweetCount%></small>
	        </div>
	        <!-- /Footer -->
	
	    </article>
    </script>
    
  </body>

</html>
