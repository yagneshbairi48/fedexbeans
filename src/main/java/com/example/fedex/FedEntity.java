package com.example.fedex;

import com.example.beans.DeliveryOptionEligibilityDetails;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "fed")
public class FedEntity {
    @Id
    @Column(name = "transactionId")
    private String transactionId  ;
    @Column(name = "customerTransactionId")
    private String customerTransactionId  ;
    @Column(name = "trackingNumber")
    private String trackingNumber  ;
    @Column(name = "carrierCode")
    private String carrierCode  ;
    @Column(name = "trackingNumberUniqueId")
    private String trackingNumberUniqueId  ;
    @Column(name = "hasAssociatedShipments")
    private boolean hasAssociatedShipments   ;
    @Column(name = "nickname")
    private String  nickname  ;
    @Column(name = "shipmentNotes")
    private String shipmentNotes;
    @Column(name = "packageIdentifiersType")
    private String packageIdentifiersType  ;
    @Column(name = "packageIdentifiersValue")
    private String[] packageIdentifiersValue  ;
    @Column(name = "distanceToDestinationUnits")
    private String distanceToDestinationUnits  ;
    @Column(name = "distanceToDestinationValue")
    private double distanceToDestinationValue   ;
    @Column(name = "consolidationDetailTimeStamp")
    private String consolidationDetailTimeStamp   ;
    @Column(name = "consolidationID")
    private String consolidationID  ;
    @Column(name = "consolidationreasonDetailDescription")
    private String consolidationreasonDetailDescription  ;
    @Column(name = "consolidationreasonDetailType")
    private String consolidationreasonDetailType;
    @Column(name = "consolidationPackageCount")
    private int consolidationPackageCount;
    @Column(name = "consolidationEventType")
    private String consolidationEventType  ;
    @Column(name = "meterNumber")
    private String meterNumber ;
    @Column(name = "returnAuthorizationName")
    private String returnAuthorizationName  ;
    @Column(name = "returnReasonDetailDescription")
    private String returnReasonDetailDescription  ;
    @Column(name = "returnReasonDetailType")
    private  String returnReasonDetailType  ;
    @Column(name = "serviceDescription")
    private String serviceDescription  ;
    @Column(name = "serviceShortDescription")
    private String serviceShortDescription  ;
    @Column(name = "serviceType")
    private String serviceType  ;
    @Column(name = "destLocationId")
    private String destLocationId  ;
    @Column(name = "destPersonName")
    private String destPersonName  ;
    @Column(name = "destPhoneNumber")
    private String destPhoneNumber  ;
    @Column(name = "destCompanyName")
    private String destCompanyName  ;
    @Column(name = "destAddressClassification")
    private String destAddressClassification  ;
    @Column(name = "destResidential")
    private boolean destResidential   ;
    @Column(name = "destStreetLines")
    private String destStreetLines  ;
    @Column(name = "destCity")
    private String destCity  ;
    @Column(name = "destUrbanizationCode")
    private String destUrbanizationCode  ;
    @Column(name = "destStateOrProvinceCode")
    private String destStateOrProvinceCode  ;
    @Column(name = "destPostalCode")
    private String destPostalCode  ;
    @Column(name = "destCountryCode")
    private String destCountryCode  ;
    @Column(name = "destCountryName")
    private String destCountryName  ;
    @Column(name = "destLocationType")
    private String destLocationType  ;
    @Column(name = "latestStatusAddressClassification")
    private String latestStatusAddressClassification  ;
    @Column(name = "latestStatusResidential")
    private boolean latestStatusResidential   ;
    @Column(name = "latestStatusStreetLines")
    private String[] latestStatusStreetLines  ;
    @Column(name = "latestStatusCity")
    private String latestStatusCity  ;
    @Column(name = "latestStatusUrbanizationCode")
    private String latestStatusUrbanizationCode  ;
    @Column(name = "latestStatusStateOrProvinceCode")
    private String latestStatusStateOrProvinceCode  ;
    @Column(name = "latestStatusPostalCode")
    private String latestStatusPostalCode  ;
    @Column(name = "latestStatusCountryCode")
    private String latestStatusCountryCode  ;
    @Column(name = "latestStatusCountryName")
    private String latestStatusCountryName  ;
    @Column(name = "latestStatusCode")
    private String latestStatusCode  ;
    @Column(name = "latestStatusDerivedCode")
    private String latestStatusDerivedCode  ;
    @Column(name = "latestStatusAncillaryReason")
    private String latestStatusAncillaryReason  ;
    @Column(name = "latestStatusAncillaryReasonDescription")
    private String latestStatusAncillaryReasonDescription  ;
    @Column(name = "latestStatusAncillaryAction")
    private String latestStatusAncillaryAction  ;
    @Column(name = "latestStatusAncillaryActionDescription")
    private String latestStatusAncillaryActionDescription  ;
    @Column(name = "latestStatusByLocale")
    private String latestStatusByLocale;
    @Column(name = "latestStatusDescription")
    private String latestStatusDescription;
    @Column(name = "latestStatusdelayType")
    private String latestStatusdelayType;
    @Column(name = "latestStatusdelaysubType")
    private String latestStatusdelaysubType  ;
    @Column(name = "latestStatusdelayStatus")
    private String latestStatusdelayStatus  ;
    @Column(name = "serviceCommitMessage")
    private String serviceCommitMessage  ;
    @Column(name = "serviceCommitType")
    private String serviceCommitType  ;
    @Type(name="json")
    @Column(name = "informationNotes")
    private  Informationnotes[] informationNotes   ;
    @Column(name = "errorCode")
    private String errorCode  ;
    @Column(name = "errorparameterList")
    private String errorparameterList   ;
    @Column(name = "errorMessage")
    private String errorMessage  ;
    @Type(type="json")
    @Column(name = "specialHandlings")
    private SpecialHandlings[] specialHandlings   ;
    @Type(type="json")
    @Column(name = "availableImages")
    private AvailableImages[] availableImages   ;
    @Column(name = "deliveryreceivedByName")
    private String deliveryreceivedByName  ;
    @Column(name = "deliverydestinationServiceArea")
    private String deliverydestinationServiceArea  ;
    @Column(name = "deliverydestinationServiceAreadescription")
    private String deliverydestinationServiceAreadescription  ;
    @Column(name = "deliverylocationDescription")
    private String deliverylocationDescription  ;
    @Column(name = "actualAddressclassification")
    private String actualAddressclassification  ;
    @Column(name = "actualAddressresidental")
    private Boolean actualAddressresidental  ;
    @Column(name = "actualAddressstreetLines")
    private String[] actualAddressstreetLines  ;
    @Column(name = "actualAddressCity")
    private String actualAddressCity  ;
    @Column(name = "actualAddressurbanizationCode")
    private String actualAddressurbanizationCode  ;
    @Column(name = "actualAddressstateOrProvinceCode")
    private String actualAddressstateOrProvinceCode  ;
    @Column(name = "actualAddresspostalCode")
    private String actualAddresspostalCode  ;
    @Column(name = "actualAddresscountryCode")
    private String actualAddresscountryCode  ;
    @Column(name = "actualAddresscountryName")
    private String actualAddresscountryName  ;
    @Column(name="deliveryToday")
    private Boolean deliveryToday;
    @Column(name="deliverylocationType")
    private String deliverylocationType;
    @Column(name="deliverysignedByName")
    private String deliverysignedByName;
    @Column(name="officeOrderDeliveryMethod")
    private String officeOrderDeliveryMethod;
    @Column(name="deliveryattempts")
    private String deliveryattempts;
    @Type(type="json")
    @Column(name="deliveryOptionEligibilityDetails")
    private DeliveryOptionEligibilityDetails[] deliveryOptionEligibilityDetails;
    @Column(name="scanEvents")
    private String scanEvents   ;
    @Column(name="scanEventsderivedStatus")
    private String scanEventsderivedStatus  ;
    @Column(name="scanLocatoinaddressClassification")
    private String scanLocatoinaddressClassification  ;
    @Column(name="scanLocationResdential")
    private Boolean scanLocationResdential  ;
    @Column(name="scanLocationstreetLines")
    private String[] scanLocationstreetLines  ;
    @Column(name="scanLocationCity")
    private String scanLocationCity  ;
    @Column(name="scanLocationurbanizationCode")
    private String scanLocationurbanizationCode  ;
    @Column(name="scanLocationstateOrProvinceCode")
    private String scanLocationstateOrProvinceCode  ;
    @Column(name="scanLocationpostalCode")
    private String scanLocationpostalCode  ;
    @Column(name="scanLocationcountryCode")
    private String scanLocationcountryCode  ;
    @Column(name="scanLocationcountryName")
    private String scanLocationcountryName  ;
    @Column(name="scanEventsLocationIdv")
    private String scanEventsLocationId  ;
    @Column(name="scanEventsLocationType")
    private String scanEventsLocationType  ;
    @Column(name="scanEventsexceptionDescription")
    private String scanEventsexceptionDescription  ;
    @Column(name="scanEventDescription")
    private String scanEventDescription  ;
    @Column(name="scaneventType")
    private String scaneventType  ;
    @Column(name="scanEventsderivedStatusCode")
    private String scanEventsderivedStatusCode  ;
    @Column(name="scanEventsexceptionCode")
    private String scanEventsexceptionCode  ;
    @Column(name="scanEventsdelayDetailType")
    private String scanEventsdelayDetailType  ;
    @Column(name="scanEventsdelayDetailsubType")
    private String scanEventsdelayDetailsubType  ;
    @Column(name="scanEventsdelayDetailStatus")
    private String scanEventsdelayDetailStatus  ;
    @Column(name="goodsClassificationCode")
    private String goodsClassificationCode  ;
    @Column(name="physicalPackagingType")
    private String physicalPackagingType  ;
    @Column(name="packagesequenceNumber")
    private String packagesequenceNumber  ;
    @Column(name="undeliveredpackageCount")
    private String undeliveredpackageCount  ;

    @Column(name="packageDescription")
    private String packageDescription  ;
    @Column(name="packageType")
    private String packageType  ;
    @Column(name="packageCount")
    private String packageCount  ;
    @Type(type="json")
    @Column(name="packageWeight")
    private Packageweight[] packageWeight   ;
    @Type(type="json")
    @Column(name="packageDimensions")
    private PackageDimensions[] packageDimensions   ;
    @Column(name="packageContent")
    private String packageContent  ;
    @Column(name="packagePieceCount")
    private String packagePieceCount  ;
    @Column(name="declaredValueCurrenct")
    private String declaredValueCurrenct  ;
    @Column(name="declaredValueAmount")
    private Double declaredValueAmount;
    @Type(typr="json")
    @Column(name="dateAndTimes")
    private DatAndTimes[] dateAndTimes   ;
    @Column(name="requestedAppointment")
    private String requestedAppointment   ;
    @Column(name="requestedAppointmentDescription")
    private String requestedAppointmentDescription  ;
    @Column(name="requestedAppointmentWindow")
    private String requestedAppointmentWindow   ;
    @Column(name="requestedAppointmentType")
    private String requestedAppointmentType  ;
    @Column(name="customDeliveryOptionsdescription")
    private String customDeliveryOptionsdescription  ;
    @Column(name="customDeliveryOptionsType")
    private String customDeliveryOptionsType  ;
    @Column(name="customDeliveryOptionsStatus")
    private String customDeliveryOptionsStatus  ;
    @Column(name="holdLocationID")
    private String holdLocationID  ;
    @Column(name="holdLocationpersonName")
    private String holdLocationpersonName ;
    @Column(name="holdLocationphoneNumber")
    private String holdLocationphoneNumber;
    @Column(name="holdLocationCompanyName")
    private String holdLocationCompanyName;
    @Column(name="holdLocationaddressClassification")
    private String holdLocationaddressClassification  ;
    @Column(name="holdLocationResidential")
    private Boolean holdLocationResidential  ;
    @Column(name="holdLocationstreetLines")
    private String holdLocationstreetLines  ;
    @Column(name="holdLocationCity")
    private String holdLocationCity  ;
    @Column(name="holdLocationurbanizationCode")
    private String holdLocationurbanizationCode  ;
    @Column(name="holdLocationstateOrProvinceCode")
    private String holdLocationstateOrProvinceCode  ;
    @Column(name="holdLocationpostalCode")
    private String holdLocationpostalCode  ;
    @Column(name="holdLocationcountryCode")
    private String holdLocationcountryCode  ;
    @Column(name="holdLocationcountryName")
    private String holdLocationcountryName  ;
    @Column(name="holdLocationType")
    private String holdLocationType  ;
    @Column(name="estimatedDeliveryTimeDescription")
    private String estimatedDeliveryTimeDescription  ;
    @Column(name="estimatedDeliveryTimeWindowbegins")
    private String estimatedDeliveryTimeWindowbegins  ;
    @Column(name="estimatedDeliveryTimeWindowends")
    private String estimatedDeliveryTimeWindowends  ;
    @Column(name="estimatedDeliveryTimeWindowType")
    private String estimatedDeliveryTimeWindowType  ;
    @Column(name="pieceCounts")
    private String pieceCounts   ;
    @Column(name="originLocationId")
    private String originLocationId  ;
    @Column(name="originLocationPersonName")
    private String originLocationPersonName  ;
    @Column(name="originLocationPhoneNumber")
    private String originLocationPhoneNumber  ;
    @Column(name="originLocationCompanyName")
    private String originLocationCompanyName  ;
    @Column(name="originLocationAddressClassification")
    private String  originLocationAddressClassification  ;
    @Column(name="originLocationResidential")
    private boolean originLocationResidential   ;
    @Column(name="originLocationStreetLines")
    private String originLocationStreetLines  ;
    @Column(name="originLocationCity")
    private String originLocationCity  ;
    @Column(name="originLocationUrbanizationCode")
    private String originLocationUrbanizationCode  ;
    @Column(name="originLocationStateOrProvinceCode")
    private String originLocationStateOrProvinceCode  ;
    @Column(name="originLocationPostalCode")
    private String originLocationPostalCode  ;
    @Column(name="originLocationcountryCode")
    private String originLocationcountryCode  ;
    @Column(name="originLocationCountryName")
    private String originLocationCountryName  ;
    @Column(name="originLocationType")
    private String originLocationType  ;
    @Column(name="recipientPersonName")
    private String recipientPersonName  ;
    @Column(name="recipientPhoneNumber")
    private String recipientPhoneNumber  ;
    @Column(name="recipientCompanyName")
    private String recipientCompanyName  ;
    @Column(name="recipientAddressClassification")
    private String recipientAddressClassification  ;
    @Column(name="recipientResidential")
    private boolean recipientResidential   ;
    @Column(name="recipientStreetLines")
    private String recipientStreetLines  ;
    @Column(name="recipientCity")
    private String recipientCity  ;
    @Column(name="recipientUrbanizationCode")
    private String recipientUrbanizationCode  ;
    @Column(name="recipientStateOrProvinceCode")
    private String recipientStateOrProvinceCode  ;
    @Column(name="recipientPostalCode")
    private String recipientPostalCode  ;
    @Column(name="recipientCountryCode")
    private String recipientCountryCode  ;
    @Column(name="recipientCountryName")
    private String recipientCountryName  ;
    @Column(name="stdTransitTimeWindowDescription")
    private String stdTransitTimeWindowDescription  ;
    @Column(name="stdTransitTimeWindowBegins")

    private String stdTransitTimeWindowBegins  ;
    @Column(name="stdTransitTimeWindowEnds")
    private String stdTransitTimeWindowEnds  ;
    @Column(name="stdTransitTimeWindowType")
    private String stdTransitTimeWindowType  ;
    @Column(name="shipmentContents")
    private String shipmentContents   ;
    @Column(name="shipmentbeforePossessionStatus")
    private boolean shipmentbeforePossessionStatus   ;
    @Column(name="shipmentWeight")
    private String shipmentWeight   ;
    @Column(name="shipmentcontentPieceCount")
    private String shipmentcontentPieceCount  ;
    @Column(name="shipmentsplitShipments")
    private String shipmentsplitShipments   ;
    @Column(name="reasonDetailDescription")
    private String reasonDetailDescription  ;
    @Column(name="reasonDetailType")
    private String reasonDetailType  ;
    @Column(name="availableNotifications")
    private String availableNotifications  ;
    @Column(name="shipperPersonName")
    private String shipperPersonName  ;
    @Column(name="shipperPhoneNumber")
    private String shipperPhoneNumber  ;
    @Column(name="shipperCompanyName")

    private String shipperCompanyName  ;
    @Column(name="shipperAddressClassification")
    private String shipperAddressClassification  ;
    @Column(name="shipperResidential")
    private boolean shipperResidential   ;
    @Column(name="shipperStreetLines")
    private String shipperStreetLines  ;
    @Column(name="shipperCity")
    private String shipperCity  ;
    @Column(name="shipperUrbanizationCode")
    private String shipperUrbanizationCode  ;
    @Column(name="shipperStateOrProvinceCode")
    private String shipperStateOrProvinceCode  ;
    @Column(name="shipperPostalCode")
    private String shipperPostalCode  ;
    @Column(name="shipperCountryCode")
    private String shipperCountryCode  ;
    @Column(name="shipperCountryName")
    private String shipperCountryName  ;
    @Column(name="lastUpdatedDestinationAddressClassification")
    private String lastUpdatedDestinationAddressClassification  ;
    @Column(name="lastUpdatedDestinationAddressResidential")
    private boolean lastUpdatedDestinationAddressResidential   ;
    @Column(name="lastUpdatedDestinationAddressStreetLines")
    private String lastUpdatedDestinationAddressStreetLines  ;
    @Column(name="lastUpdatedDestinationAddressCity")
    private String lastUpdatedDestinationAddressCity  ;
    @Column(name="lastUpdatedDestinationAddressUrbanizationCode")
    private String lastUpdatedDestinationAddressUrbanizationCode  ;
    @Column(name="lastUpdatedDestinationAddressStateOrProvinceCode")
    private String lastUpdatedDestinationAddressStateOrProvinceCode  ;
    @Column(name="lastUpdatedDestinationAddressPostalCode")
    private String lastUpdatedDestinationAddressPostalCode  ;
    @Column(name="lastUpdatedDestinationAddressCountryCode")
    private String lastUpdatedDestinationAddressCountryCode  ;
    @Column(name="lastUpdatedDestinationAddressCountryName")
    private String lastUpdatedDestinationAddressCountryName ;
    @Column(name="alerts")
    private String alerts;

}
