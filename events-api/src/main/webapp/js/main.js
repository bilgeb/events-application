// The root URL for the RESTful services
var rootURL = "http://localhost:9765/";

var citySelected;

// Retrieve category list when application starts
findAllCategories();


// Register listeners
$('#btnGetEvents').click(function() {
    search($('#txtLocation').val());
    return false;
});

$('#categoriesList a').live('click', function() {
    findById($(this).data('id'));
});

function search(searchKey) {
    if (searchKey == '')
        return false;
    else
        findByName(searchKey);
}

function findAllCategories() {
    console.log('findAllCategories');
    $.ajax({
        type: 'GET',
        url: rootURL + '/categories',
        dataType: "json", // data type of response
        success: function(data) {
            console.log('findAllCategories success');
            renderCitiesList(data);
        },
        error: function (xhr, ajaxOptions, thrownError) {
            console.log('findAllCategories error : ' + xhr.status);
            alert(thrownError);
        }
    });
}

function findById(id) {
    console.log('findById: ' + id);
    $.ajax({
        type: 'GET',
        url: rootURL + '/id/' + id,
        dataType: "json",
        success: function(data){
            console.log('findById success: ' + data.name);
            citySelected = data;
            renderResponse(citySelected);
        }
    });
}

function findByName(name) {
    console.log('findByName: ' + name);
    $.ajax({
        type: 'GET',
        url: rootURL + '/name/' + name,
        dataType: "json",
        success: function(data){
            console.log('findByName success: ' + data.name);
            citySelected = data;
            renderResponse(citySelected);
        }
    });
}

function renderCategoriesList(data) {
    var list = data == null ? [] : (data instanceof Array ? data : [data]);
    var options = $("#categoriesList");
    $.each(list, function(index, category) {
        options.append($("<option />").val(this.ID).text(this.name));
    });
}

function renderResponse(response) {
    $('#events').val(response.events);
}














