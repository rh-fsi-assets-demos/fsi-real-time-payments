import { ProductFeatures } from './product-features';

export interface ProductBenefits {
  id: number;
  title: string;
  subtitle: string;
  featureList: ProductFeatures[];
}
