import org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.ArrayOfPurchaseRequestItemCreationDto;
import org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.PurchaseOrderDto;
import org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.PurchaseRequestCreationDto;
import org.datacontract.schemas._2004._07.documentmanagement_business_service_integration.PurchaseRequestItemCreationDto;
import org.tempuri.DeliveryWebService;
import org.tempuri.ObjectFactory;

public class Test {
    public static void main(String[] args) {

        DeliveryWebService service = new DeliveryWebService();

        // https://zenidas.wordpress.com/recipes/avoid-generation-of-ws-client-with-jaxbelement/

        /* 
        // получаем номер заявки
        PurchaseOrderDto res = service.getBasicHttpBindingIDeliveryWebService().getPurchaseOrderByUid("6f4f3b39-b8e3-4294-ade3-1a3c25681460");
        System.out.println(res.getCode());
        */

        
        // создаем проект
        ObjectFactory factory = new ObjectFactory();
        PurchaseRequestCreationDto dto = new PurchaseRequestCreationDto();
        dto.setAuthorLogin("fe\\va.tkalin");

        ArrayOfPurchaseRequestItemCreationDto arr = new ArrayOfPurchaseRequestItemCreationDto();
        PurchaseRequestItemCreationDto purchaseRequestItemCreationDto = new PurchaseRequestItemCreationDto();
        purchaseRequestItemCreationDto.setQuantity(10f);
        purchaseRequestItemCreationDto.setCode("00000020688");
        arr.getPurchaseRequestItemCreationDto().add(purchaseRequestItemCreationDto);
        dto.setItemList(arr);

        service.getBasicHttpBindingIDeliveryWebService().createPurchaseRequest(dto);

    }
}
