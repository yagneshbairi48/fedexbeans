package com.example.fedex;

import com.example.beans.Fed;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class FedexApplication {



    public static void main(String[] args) {
		SpringApplication.run(FedexApplication.class, args);


		String token = "{\n" +
				"  \"transactionId\": \"624deea6-b709-470c-8c39-4b5511281492\",\n" +
				"  \"customerTransactionId\": \"AnyCo_order123456789\",\n" +
				"  \"output\": {\n" +
				"    \"completeTrackResults\": [\n" +
				"      {\n" +
				"        \"trackingNumber\": \"123456789012\",\n" +
				"        \"trackResults\": [\n" +
				"          {\n" +
				"            \"trackingNumberInfo\": {\n" +
				"              \"trackingNumber\": \"128667043726\",\n" +
				"              \"carrierCode\": \"FDXE\",\n" +
				"              \"trackingNumberUniqueId\": \"245822~123456789012~FDEG\"\n" +
				"            },\n" +
				"            \"additionalTrackingInfo\": {\n" +
				"              \"hasAssociatedShipments\": false,\n" +
				"              \"nickname\": \"shipment nickname\",\n" +
				"              \"packageIdentifiers\": [\n" +
				"                {\n" +
				"                  \"type\": \"SHIPPER_REFERENCE\",\n" +
				"                  \"value\": \"ASJFGVAS\",\n" +
				"                  \"trackingNumberUniqueId\": \"245822~123456789012~FDEG\"\n" +
				"                }\n" +
				"              ],\n" +
				"              \"shipmentNotes\": \"shipment notes\"\n" +
				"            },\n" +
				"            \"distanceToDestination\": {\n" +
				"              \"units\": \"KM\",\n" +
				"              \"value\": 685.7\n" +
				"            },\n" +
				"            \"consolidationDetail\": [\n" +
				"              {\n" +
				"                \"timeStamp\": \"2020-10-13T03:54:44-06:00\",\n" +
				"                \"consolidationID\": \"47936927\",\n" +
				"                \"reasonDetail\": {\n" +
				"                  \"description\": \"Wrong color\",\n" +
				"                  \"type\": \"REJECTED\"\n" +
				"                },\n" +
				"                \"packageCount\": 25,\n" +
				"                \"eventType\": \"PACKAGE_ADDED_TO_CONSOLIDATION\"\n" +
				"              }\n" +
				"            ],\n" +
				"            \"meterNumber\": \"8468376\",\n" +
				"            \"returnDetail\": {\n" +
				"              \"authorizationName\": \"Sammy Smith\",\n" +
				"              \"reasonDetail\": [\n" +
				"                {\n" +
				"                  \"description\": \"Wrong color\",\n" +
				"                  \"type\": \"REJECTED\"\n" +
				"                }\n" +
				"              ]\n" +
				"            },\n" +
				"            \"serviceDetail\": {\n" +
				"              \"description\": \"FedEx Freight Economy.\",\n" +
				"              \"shortDescription\": \"FL\",\n" +
				"              \"type\": \"FEDEX_FREIGHT_ECONOMY\"\n" +
				"            },\n" +
				"            \"destinationLocation\": {\n" +
				"              \"locationId\": \"SEA\",\n" +
				"              \"locationContactAndAddress\": {\n" +
				"                \"contact\": {\n" +
				"                  \"personName\": \"John Taylor\",\n" +
				"                  \"phoneNumber\": \"1234567890\",\n" +
				"                  \"companyName\": \"Fedex\"\n" +
				"                },\n" +
				"                \"address\": {\n" +
				"                  \"addressClassification\": \"BUSINESS\",\n" +
				"                  \"residential\": false,\n" +
				"                  \"streetLines\": [\n" +
				"                    \"1043 North Easy Street\",\n" +
				"                    \"Suite 999\"\n" +
				"                  ],\n" +
				"                  \"city\": \"SEATTLE\",\n" +
				"                  \"urbanizationCode\": \"RAFAEL\",\n" +
				"                  \"stateOrProvinceCode\": \"WA\",\n" +
				"                  \"postalCode\": \"98101\",\n" +
				"                  \"countryCode\": \"US\",\n" +
				"                  \"countryName\": \"United States\"\n" +
				"                }\n" +
				"              },\n" +
				"              \"locationType\": \"PICKUP_LOCATION\"\n" +
				"            },\n" +
				"            \"latestStatusDetail\": {\n" +
				"              \"scanLocation\": {\n" +
				"                \"addressClassification\": \"BUSINESS\",\n" +
				"                \"residential\": false,\n" +
				"                \"streetLines\": [\n" +
				"                  \"1043 North Easy Street\",\n" +
				"                  \"Suite 999\"\n" +
				"                ],\n" +
				"                \"city\": \"SEATTLE\",\n" +
				"                \"urbanizationCode\": \"RAFAEL\",\n" +
				"                \"stateOrProvinceCode\": \"WA\",\n" +
				"                \"postalCode\": \"98101\",\n" +
				"                \"countryCode\": \"US\",\n" +
				"                \"countryName\": \"United States\"\n" +
				"              },\n" +
				"              \"code\": \"PU\",\n" +
				"              \"derivedCode\": \"PU\",\n" +
				"              \"ancillaryDetails\": [\n" +
				"                {\n" +
				"                  \"reason\": \"15\",\n" +
				"                  \"reasonDescription\": \"Customer not available or business closed\",\n" +
				"                  \"action\": \"Contact us at <http://www.fedex.com/us/customersupport/call/index.html> to discuss possible delivery or pickup alternatives.\",\n" +
				"                  \"actionDescription\": \"Customer not Available or Business Closed\"\n" +
				"                }\n" +
				"              ],\n" +
				"              \"statusByLocale\": \"Picked up\",\n" +
				"              \"description\": \"Picked up\",\n" +
				"              \"delayDetail\": {\n" +
				"                \"type\": \"WEATHER\",\n" +
				"                \"subType\": \"SNOW\",\n" +
				"                \"status\": \"DELAYED\"\n" +
				"              }\n" +
				"            },\n" +
				"            \"serviceCommitMessage\": {\n" +
				"              \"message\": \"No scheduled delivery date available at this time.\",\n" +
				"              \"type\": \"ESTIMATED_DELIVERY_DATE_UNAVAILABLE\"\n" +
				"            },\n" +
				"            \"informationNotes\": [\n" +
				"              {\n" +
				"                \"code\": \"CLEARANCE_ENTRY_FEE_APPLIES\",\n" +
				"                \"description\": \"this is an informational message\"\n" +
				"              }\n" +
				"            ],\n" +
				"            \"error\": {\n" +
				"              \"code\": \"TRACKING.TRACKINGNUMBER.EMPTY\",\n" +
				"              \"parameterList\": [\n" +
				"                {\n" +
				"                  \"value\": \"value\",\n" +
				"                  \"key\": \"key\"\n" +
				"                }\n" +
				"              ],\n" +
				"              \"message\": \"Please provide tracking number.\"\n" +
				"            },\n" +
				"            \"specialHandlings\": [\n" +
				"              {\n" +
				"                \"description\": \"Deliver Weekday\",\n" +
				"                \"type\": \"DELIVER_WEEKDAY\",\n" +
				"                \"paymentType\": \"OTHER\"\n" +
				"              }\n" +
				"            ],\n" +
				"            \"availableImages\": [\n" +
				"              {\n" +
				"                \"size\": \"LARGE\",\n" +
				"                \"type\": \"BILL_OF_LADING\"\n" +
				"              }\n" +
				"            ],\n" +
				"            \"deliveryDetails\": {\n" +
				"              \"receivedByName\": \"Reciever\",\n" +
				"              \"destinationServiceArea\": \"EDDUNAVAILABLE\",\n" +
				"              \"destinationServiceAreaDescription\": \"Appointment required\",\n" +
				"              \"locationDescription\": \"Receptionist/Front Desk\",\n" +
				"              \"actualDeliveryAddress\": {\n" +
				"                \"addressClassification\": \"BUSINESS\",\n" +
				"                \"residential\": false,\n" +
				"                \"streetLines\": [\n" +
				"                  \"1043 North Easy Street\",\n" +
				"                  \"Suite 999\"\n" +
				"                ],\n" +
				"                \"city\": \"SEATTLE\",\n" +
				"                \"urbanizationCode\": \"RAFAEL\",\n" +
				"                \"stateOrProvinceCode\": \"WA\",\n" +
				"                \"postalCode\": \"98101\",\n" +
				"                \"countryCode\": \"US\",\n" +
				"                \"countryName\": \"United States\"\n" +
				"              },\n" +
				"              \"deliveryToday\": false,\n" +
				"              \"locationType\": \"FEDEX_EXPRESS_STATION\",\n" +
				"              \"signedByName\": \"Reciever\",\n" +
				"              \"officeOrderDeliveryMethod\": \"Courier\",\n" +
				"              \"deliveryAttempts\": \"0\",\n" +
				"              \"deliveryOptionEligibilityDetails\": [\n" +
				"                {\n" +
				"                  \"option\": \"INDIRECT_SIGNATURE_RELEASE\",\n" +
				"                  \"eligibility\": \"INELIGIBLE\"\n" +
				"                }\n" +
				"              ]\n" +
				"            },\n" +
				"            \"scanEvents\": [\n" +
				"              {\n" +
				"                \"date\": \"2018-02-02T12:01:00-07:00\",\n" +
				"                \"derivedStatus\": \"Picked Up\",\n" +
				"                \"scanLocation\": {\n" +
				"                  \"addressClassification\": \"BUSINESS\",\n" +
				"                  \"residential\": false,\n" +
				"                  \"streetLines\": [\n" +
				"                    \"1043 North Easy Street\",\n" +
				"                    \"Suite 999\"\n" +
				"                  ],\n" +
				"                  \"city\": \"SEATTLE\",\n" +
				"                  \"urbanizationCode\": \"RAFAEL\",\n" +
				"                  \"stateOrProvinceCode\": \"WA\",\n" +
				"                  \"postalCode\": \"98101\",\n" +
				"                  \"countryCode\": \"US\",\n" +
				"                  \"countryName\": \"United States\"\n" +
				"                },\n" +
				"                \"locationId\": \"SEA\",\n" +
				"                \"locationType\": \"PICKUP_LOCATION\",\n" +
				"                \"exceptionDescription\": \"Package available for clearance\",\n" +
				"                \"eventDescription\": \"Picked Up\",\n" +
				"                \"eventType\": \"PU\",\n" +
				"                \"derivedStatusCode\": \"PU\",\n" +
				"                \"exceptionCode\": \"A25\",\n" +
				"                \"delayDetail\": {\n" +
				"                  \"type\": \"WEATHER\",\n" +
				"                  \"subType\": \"SNOW\",\n" +
				"                  \"status\": \"DELAYED\"\n" +
				"                }\n" +
				"              }\n" +
				"            ],\n" +
				"            \"dateAndTimes\": [\n" +
				"              {\n" +
				"                \"dateTime\": \"2007-09-27T00:00:00\",\n" +
				"                \"type\": \"ACTUAL_DELIVERY\"\n" +
				"              }\n" +
				"            ],\n" +
				"            \"packageDetails\": {\n" +
				"              \"physicalPackagingType\": \"BARREL\",\n" +
				"              \"sequenceNumber\": \"45\",\n" +
				"              \"undeliveredCount\": \"7\",\n" +
				"              \"packagingDescription\": {\n" +
				"                \"description\": \"FedEx Pak\",\n" +
				"                \"type\": \"FEDEX_PAK\"\n" +
				"              },\n" +
				"              \"count\": \"1\",\n" +
				"              \"weightAndDimensions\": {\n" +
				"                \"weight\": [\n" +
				"                  {\n" +
				"                    \"unit\": \"LB\",\n" +
				"                    \"value\": \"22222.0\"\n" +
				"                  }\n" +
				"                ],\n" +
				"                \"dimensions\": [\n" +
				"                  {\n" +
				"                    \"length\": 100,\n" +
				"                    \"width\": 50,\n" +
				"                    \"height\": 30,\n" +
				"                    \"units\": \"CM\"\n" +
				"                  }\n" +
				"                ]\n" +
				"              },\n" +
				"              \"packageContent\": [\n" +
				"                \"wire hangers\",\n" +
				"                \"buttons\"\n" +
				"              ],\n" +
				"              \"contentPieceCount\": \"100\",\n" +
				"              \"declaredValue\": {\n" +
				"                \"currency\": \"USD\",\n" +
				"                \"value\": 56.8\n" +
				"              }\n" +
				"            },\n" +
				"            \"goodsClassificationCode\": \"goodsClassificationCode\",\n" +
				"            \"holdAtLocation\": {\n" +
				"              \"locationId\": \"SEA\",\n" +
				"              \"locationContactAndAddress\": {\n" +
				"                \"contact\": {\n" +
				"                  \"personName\": \"John Taylor\",\n" +
				"                  \"phoneNumber\": \"1234567890\",\n" +
				"                  \"companyName\": \"Fedex\"\n" +
				"                },\n" +
				"                \"address\": {\n" +
				"                  \"addressClassification\": \"BUSINESS\",\n" +
				"                  \"residential\": false,\n" +
				"                  \"streetLines\": [\n" +
				"                    \"1043 North Easy Street\",\n" +
				"                    \"Suite 999\"\n" +
				"                  ],\n" +
				"                  \"city\": \"SEATTLE\",\n" +
				"                  \"urbanizationCode\": \"RAFAEL\",\n" +
				"                  \"stateOrProvinceCode\": \"WA\",\n" +
				"                  \"postalCode\": \"98101\",\n" +
				"                  \"countryCode\": \"US\",\n" +
				"                  \"countryName\": \"United States\"\n" +
				"                }\n" +
				"              },\n" +
				"              \"locationType\": \"PICKUP_LOCATION\"\n" +
				"            },\n" +
				"            \"customDeliveryOptions\": [\n" +
				"              {\n" +
				"                \"requestedAppointmentDetail\": {\n" +
				"                  \"date\": \"2019-05-07\",\n" +
				"                  \"window\": [\n" +
				"                    {\n" +
				"                      \"description\": \"Description field\",\n" +
				"                      \"window\": {\n" +
				"                        \"begins\": \"2021-10-01T08:00:00\",\n" +
				"                        \"ends\": \"2021-10-15T00:00:00-06:00\"\n" +
				"                      },\n" +
				"                      \"type\": \"ESTIMATED_DELIVERY\"\n" +
				"                    }\n" +
				"                  ]\n" +
				"                },\n" +
				"                \"description\": \"Redirect the package to the hold location.\",\n" +
				"                \"type\": \"REDIRECT_TO_HOLD_AT_LOCATION\",\n" +
				"                \"status\": \"HELD\"\n" +
				"              }\n" +
				"            ],\n" +
				"            \"estimatedDeliveryTimeWindow\": {\n" +
				"              \"description\": \"Description field\",\n" +
				"              \"window\": {\n" +
				"                \"begins\": \"2021-10-01T08:00:00\",\n" +
				"                \"ends\": \"2021-10-15T00:00:00-06:00\"\n" +
				"              },\n" +
				"              \"type\": \"ESTIMATED_DELIVERY\"\n" +
				"            },\n" +
				"            \"pieceCounts\": [\n" +
				"              {\n" +
				"                \"count\": \"35\",\n" +
				"                \"description\": \"picec count description\",\n" +
				"                \"type\": \"ORIGIN\"\n" +
				"              }\n" +
				"            ],\n" +
				"            \"originLocation\": {\n" +
				"              \"locationId\": \"SEA\",\n" +
				"              \"locationContactAndAddress\": {\n" +
				"                \"contact\": {\n" +
				"                  \"personName\": \"John Taylor\",\n" +
				"                  \"phoneNumber\": \"1234567890\",\n" +
				"                  \"companyName\": \"Fedex\"\n" +
				"                },\n" +
				"                \"address\": {\n" +
				"                  \"addressClassification\": \"BUSINESS\",\n" +
				"                  \"residential\": false,\n" +
				"                  \"streetLines\": [\n" +
				"                    \"1043 North Easy Street\",\n" +
				"                    \"Suite 999\"\n" +
				"                  ],\n" +
				"                  \"city\": \"SEATTLE\",\n" +
				"                  \"urbanizationCode\": \"RAFAEL\",\n" +
				"                  \"stateOrProvinceCode\": \"WA\",\n" +
				"                  \"postalCode\": \"98101\",\n" +
				"                  \"countryCode\": \"US\",\n" +
				"                  \"countryName\": \"United States\"\n" +
				"                }\n" +
				"              },\n" +
				"              \"locationType\": \"PICKUP_LOCATION\"\n" +
				"            },\n" +
				"            \"recipientInformation\": {\n" +
				"              \"contact\": {\n" +
				"                \"personName\": \"John Taylor\",\n" +
				"                \"phoneNumber\": \"1234567890\",\n" +
				"                \"companyName\": \"Fedex\"\n" +
				"              },\n" +
				"              \"address\": {\n" +
				"                \"addressClassification\": \"BUSINESS\",\n" +
				"                \"residential\": false,\n" +
				"                \"streetLines\": [\n" +
				"                  \"1043 North Easy Street\",\n" +
				"                  \"Suite 999\"\n" +
				"                ],\n" +
				"                \"city\": \"SEATTLE\",\n" +
				"                \"urbanizationCode\": \"RAFAEL\",\n" +
				"                \"stateOrProvinceCode\": \"WA\",\n" +
				"                \"postalCode\": \"98101\",\n" +
				"                \"countryCode\": \"US\",\n" +
				"                \"countryName\": \"United States\"\n" +
				"              }\n" +
				"            },\n" +
				"            \"standardTransitTimeWindow\": {\n" +
				"              \"description\": \"Description field\",\n" +
				"              \"window\": {\n" +
				"                \"begins\": \"2021-10-01T08:00:00\",\n" +
				"                \"ends\": \"2021-10-15T00:00:00-06:00\"\n" +
				"              },\n" +
				"              \"type\": \"ESTIMATED_DELIVERY\"\n" +
				"            },\n" +
				"            \"shipmentDetails\": {\n" +
				"              \"contents\": [\n" +
				"                {\n" +
				"                  \"itemNumber\": \"RZ5678\",\n" +
				"                  \"receivedQuantity\": \"13\",\n" +
				"                  \"description\": \"pulyurethane rope\",\n" +
				"                  \"partNumber\": \"RK1345\"\n" +
				"                }\n" +
				"              ],\n" +
				"              \"beforePossessionStatus\": false,\n" +
				"              \"weight\": [\n" +
				"                {\n" +
				"                  \"unit\": \"LB\",\n" +
				"                  \"value\": \"22222.0\"\n" +
				"                }\n" +
				"              ],\n" +
				"              \"contentPieceCount\": \"3333\",\n" +
				"              \"splitShipments\": [\n" +
				"                {\n" +
				"                  \"pieceCount\": \"10\",\n" +
				"                  \"statusDescription\": \"status\",\n" +
				"                  \"timestamp\": \"2019-05-07T08:00:07\",\n" +
				"                  \"statusCode\": \"statuscode\"\n" +
				"                }\n" +
				"              ]\n" +
				"            },\n" +
				"            \"reasonDetail\": {\n" +
				"              \"description\": \"Wrong color\",\n" +
				"              \"type\": \"REJECTED\"\n" +
				"            },\n" +
				"            \"availableNotifications\": [\n" +
				"              \"ON_DELIVERY\",\n" +
				"              \"ON_EXCEPTION\"\n" +
				"            ],\n" +
				"            \"shipperInformation\": {\n" +
				"              \"contact\": {\n" +
				"                \"personName\": \"John Taylor\",\n" +
				"                \"phoneNumber\": \"1234567890\",\n" +
				"                \"companyName\": \"Fedex\"\n" +
				"              },\n" +
				"              \"address\": {\n" +
				"                \"addressClassification\": \"BUSINESS\",\n" +
				"                \"residential\": false,\n" +
				"                \"streetLines\": [\n" +
				"                  \"1043 North Easy Street\",\n" +
				"                  \"Suite 999\"\n" +
				"                ],\n" +
				"                \"city\": \"SEATTLE\",\n" +
				"                \"urbanizationCode\": \"RAFAEL\",\n" +
				"                \"stateOrProvinceCode\": \"WA\",\n" +
				"                \"postalCode\": \"98101\",\n" +
				"                \"countryCode\": \"US\",\n" +
				"                \"countryName\": \"United States\"\n" +
				"              }\n" +
				"            },\n" +
				"            \"lastUpdatedDestinationAddress\": {\n" +
				"              \"addressClassification\": \"BUSINESS\",\n" +
				"              \"residential\": false,\n" +
				"              \"streetLines\": [\n" +
				"                \"1043 North Easy Street\",\n" +
				"                \"Suite 999\"\n" +
				"              ],\n" +
				"              \"city\": \"SEATTLE\",\n" +
				"              \"urbanizationCode\": \"RAFAEL\",\n" +
				"              \"stateOrProvinceCode\": \"WA\",\n" +
				"              \"postalCode\": \"98101\",\n" +
				"              \"countryCode\": \"US\",\n" +
				"              \"countryName\": \"United States\"\n" +
				"            }\n" +
				"          }\n" +
				"        ]\n" +
				"      }\n" +
				"    ],\n" +
				"    \"alerts\": \"TRACKING.DATA.NOTFOUND -  Tracking data unavailable\"\n" +
				"  }\n" +
				"}";
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			Fed fed = objectMapper.readValue(token, Fed.class);
			System.out.println(fed);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
