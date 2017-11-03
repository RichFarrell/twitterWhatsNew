define(function (require) {
    'use strict';

    var Backbone = require('backbone');
    var _ = require("underscore");

    return Backbone.View.extend({

		el: $("#twitterList"),
		template: _.template($("#template_twitter").html()),
		tagName: 'ul',
		class: "twitterList",

		initialize: function() {
			this.listenTo( this.collection, 'reset add change remove', this.render, this );
		},

		render: function() {
			this.$el.empty();

			this.collection.each(function(twitterList) {
				this.$el.append(this.template(twitterList.toJSON()));
			}.bind(this));

			return this;
		}
	});
});
