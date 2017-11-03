/*global require*/
'use strict';

define(function(require) {
	
	var PageView = require('pageView');
	
	window.pageView = new PageView();
	Backbone.history.start();

});