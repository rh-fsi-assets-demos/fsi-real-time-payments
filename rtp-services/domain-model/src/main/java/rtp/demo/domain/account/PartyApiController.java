package rtp.demo.domain.account;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import rtp.demo.domain.account.OBErrorResponse1;
import rtp.demo.domain.account.OBReadParty2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-20T02:23:06.926-04:00[America/New_York]")
@Controller
public class PartyApiController implements PartyApi {

    private static final Logger log = LoggerFactory.getLogger(PartyApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PartyApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<OBReadParty2> getParty(@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization
,@ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-auth-date", required=false) String xFapiAuthDate
,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress
,@ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId
,@ApiParam(value = "Indicates the user-agent that the PSU is using." ) @RequestHeader(value="x-customer-user-agent", required=false) String xCustomerUserAgent
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OBReadParty2>(objectMapper.readValue("{\n  \"Meta\" : {\n    \"FirstAvailableDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"TotalPages\" : 0\n  },\n  \"Links\" : {\n    \"Last\" : \"http://example.com/aeiou\",\n    \"Prev\" : \"http://example.com/aeiou\",\n    \"Next\" : \"http://example.com/aeiou\",\n    \"Self\" : \"http://example.com/aeiou\",\n    \"First\" : \"http://example.com/aeiou\"\n  },\n  \"Data\" : {\n    \"Party\" : {\n      \"BeneficialOwnership\" : true,\n      \"Address\" : [ {\n        \"StreetName\" : \"StreetName\",\n        \"CountrySubDivision\" : \"CountrySubDivision\",\n        \"AddressLine\" : [ \"AddressLine\", \"AddressLine\", \"AddressLine\", \"AddressLine\", \"AddressLine\" ],\n        \"BuildingNumber\" : \"BuildingNumber\",\n        \"TownName\" : \"TownName\",\n        \"Country\" : \"Country\",\n        \"AddressType\" : \"Business\",\n        \"PostCode\" : \"PostCode\"\n      }, {\n        \"StreetName\" : \"StreetName\",\n        \"CountrySubDivision\" : \"CountrySubDivision\",\n        \"AddressLine\" : [ \"AddressLine\", \"AddressLine\", \"AddressLine\", \"AddressLine\", \"AddressLine\" ],\n        \"BuildingNumber\" : \"BuildingNumber\",\n        \"TownName\" : \"TownName\",\n        \"Country\" : \"Country\",\n        \"AddressType\" : \"Business\",\n        \"PostCode\" : \"PostCode\"\n      } ],\n      \"AccountRole\" : \"AccountRole\",\n      \"Mobile\" : \"Mobile\",\n      \"EmailAddress\" : \"EmailAddress\",\n      \"Name\" : \"Name\",\n      \"LegalStructure\" : \"LegalStructure\",\n      \"PartyNumber\" : \"PartyNumber\",\n      \"Relationships\" : {\n        \"Account\" : {\n          \"Related\" : \"http://example.com/aeiou\",\n          \"Id\" : \"Id\"\n        }\n      },\n      \"PartyId\" : \"PartyId\",\n      \"FullLegalName\" : \"FullLegalName\",\n      \"Phone\" : \"Phone\",\n      \"PartyType\" : \"Delegate\"\n    }\n  }\n}", OBReadParty2.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OBReadParty2>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OBReadParty2>(HttpStatus.NOT_IMPLEMENTED);
    }

}
