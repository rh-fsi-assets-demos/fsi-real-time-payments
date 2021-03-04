import { DeliveryAddress } from './ob-delivery-address';

export class ObRisk {
  PaymentContextCode = '';
  MerchantCategoryCode = '';
  MerchantCustomerIdentification = '';
  DeliveryAddress = new DeliveryAddress();
}
