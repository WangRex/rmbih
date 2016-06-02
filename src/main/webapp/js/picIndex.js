var picModule = (function() {
	var my = {};

	function getPicList(userId) {
		$.ajax({
			type : "post",
			url : "/pic/getPicList",
			data : {
				userId : userId
			},
			dataType : "json",
			async : false,
			success : function(data) {
				console.log(data);
				$("#sb-slider").html(template('picList', {
					list : data
				}));
				Page.init();
			}
		});
	}

	my.getPicList = function(userId) {
		getPicList(userId);
	};

	return my;
}());