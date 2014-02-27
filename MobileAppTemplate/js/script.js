$(document).ready(function(){
	//console.log("ready");
	var closed = true;
	var sliderValue = 0;
	
	$("#toggleButton").click(function(){
		//alert("test");
		closed = !closed;
		
		if(closed){
			$("#statusLED").css("background-color", "green");
			$("#toggleButton").html("Off");
		}else{
			$("#statusLED").css("background-color", "red");
			$("#toggleButton").html("On");
		}		
	});
	
	$('#slider-0').change(function(eventObject){
		alert("Wert geändert von " + sliderValue + " auf neuen Wert " + eventObject.currentTarget.value);
		sliderValue = eventObject.currentTarget.value;
	});
});