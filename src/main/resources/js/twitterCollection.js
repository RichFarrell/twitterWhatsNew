define(function (require) {
    'use strict';

    var Backbone = require('backbone'),
		twitterModel = require('twitterModel');

    return Backbone.Collection.extend({
		url: "/twitterList",
		model: twitterModel,
		comparator: "name"
	});
});
