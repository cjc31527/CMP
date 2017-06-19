$(".button-collapse").sideNav({
  'edge': 'left'
});
$(document).ready(function(){
  $('.scrollspy').scrollSpy();
});

$('.collapsible').collapsible();

$('.carousel.carousel-slider').carousel({full_width: true});

$('.datepicker').pickadate({
    selectMonths: true, // Creates a dropdown to control month
    selectYears: 15 // Creates a dropdown of 15 years to control year
  });
      