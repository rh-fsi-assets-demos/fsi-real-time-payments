import { UserProfile } from '../../app/common/model/user-profile';

export const SYSTEMUSERS: UserProfile[] = [
  {
    id: '1', accountHolderId: '11111', title: 'Mr.', firstName: 'Kevin', lastName: '', address1: '', address2: '',
    city: '', state: '', zipCode: '', workPhone: '', cellPhone: '', email: '', role: 'user'
  },
  {
    id: '2', accountHolderId: '22222', title: 'Ms.', firstName: 'Jane', lastName: 'Doe', address1: '', address2: '',
    city: '', state: '', zipCode: '', workPhone: '', cellPhone: '', email: '', role: 'user'
  },
  {
    id: '2', accountHolderId: '22222', title: 'Ms.', firstName: 'Jane', lastName: 'Doe', address1: '', address2: '',
    city: '', state: '', zipCode: '', workPhone: '', cellPhone: '', email: '', role: 'user'
  },
  {
    id: '3', accountHolderId: '33333', title: '', firstName: 'Red', lastName: 'Hat', address1: '100 East Davie Street', address2: '',
    city: 'Raleigh', state: 'NC', zipCode: '27601', workPhone: '1-800-733-4281', cellPhone: '',
    email: 'customerservice@redhat.com', role: 'customerService'
  },
  {
    id: '4', accountHolderId: '44444', title: '', firstName: 'Abraham', lastName: 'Lincoln', address1: '', address2: '',
    city: '', state: '', zipCode: '', workPhone: '', cellPhone: '', email: '', role: 'admin'
  }
];
