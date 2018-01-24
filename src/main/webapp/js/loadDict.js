function loadDict(typeCode, selectId,defultValue) {
    var selectHtml = "<option value='' >---请选择---</option>";
    $.post(
        "${pageContext.request.contextPath}/baseDict",
        {typeCode: typeCode},
        function (data) {
            $.each(data, function (i, obj) {
            	if(defultValue==obj.dictId){
            		 selectHtml += '<option value="' + obj.dictId + '" selected="selected">' + obj.itemName + "</option>";
            	}else{
            		 selectHtml += "<option value='" + obj.dictId + "'>" + obj.itemName + "</option>";
            	}
            });
            $('#'+selectId).html(selectHtml);
        });
   
    
}

