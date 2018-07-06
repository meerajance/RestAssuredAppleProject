Apple project
=====================


##Objective##
Intent of this project is to get required data from json response

###Below steps are taken as part of this project
1. Please find the sample json used for testing
2. Ran npm json-server eg: json-server cars.json for testing purpose




Sample json:
endpoint: http://localhost:3000/cars

{"cars":[{
		"Car": {
			"make": "Audi",
			"model": "A7",
			"vin": "HHHHHHY64352JITEG98K",
			"metadata": {
				"Color": "Black",
				"Notes": "Scratches on the front side of the car"
			},
			"perdayrent": {
				"Price": 100,
				"Discount": 10
			},
			"metrics": {
				"yoymaintenancecost": 2190.76,
				"depreciation": 2256.43,
				"rentalcount": {
					"lastweek": 4,
					"yeartodate": 221
				}
			}
		}
	},
	{
		"Car": {
			"make": "Chrysler",
			"model": "pacifica",
			"vin": "JJJJJJJ4352JITEG98K",
			"metadata": {
				"Color": "Black",
				"Notes": "Scratches on the front side of the car"
			},
			"perdayrent": {
				"Price": 120,
				"Discount": 30
			},
			"metrics": {
				"yoymaintenancecost": 2190.76,
				"depreciation": 2256.43,
				"rentalcount": {
					"lastweek": 4,
					"yeartodate": 221
				}
			}
		}
	},
	{
		"Car": {
			"make": "Benz",
			"model": "C",
			"vin": "KKKKKKK52JITEG98K",
			"metadata": {
				"Color": "Black",
				"Notes": "Scratches on the front side of the car"
			},
			"perdayrent": {
				"Price": 140,
				"Discount": 10
			},
			"metrics": {
				"yoymaintenancecost": 2190.76,
				"depreciation": 2256.43,
				"rentalcount": {
					"lastweek": 4,
					"yeartodate": 221
				}
			}
		}
	},
	{
		"Car": {
			"make": "Tesla",
			"model": "3",
			"vin": "LLLLLLL352JITEG98K",
			"metadata": {
				"Color": "Blue",
				"Notes": "Scratches on the front side of the car"
			},
			"perdayrent": {
				"Price": 200,
				"Discount": 10
			},
			"metrics": {
				"yoymaintenancecost": 2190.76,
				"depreciation": 2256.43,
				"rentalcount": {
					"lastweek": 4,
					"yeartodate": 221
				}
			}
		}
	},
	{
		"Car": {
			"make": "Tesla",
			"model": "S",
			"vin": "OOOOOOHY64352JHHHYUU",
			"metadata": {
				"Color": "Blue",
				"Notes": "Scratches on the front side of the car-2"
			},
			"perdayrent": {
				"Price": 120,
				"Discount": 10
			},
			"metrics": {
				"yoymaintenancecost": 2190.76,
				"depreciation": 2256.43,
				"rentalcount": {
					"lastweek": 4,
					"yeartodate": 221
				}
			}
		}
	}
	
]
}
