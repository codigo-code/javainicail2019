import { TestBed } from '@angular/core/testing';

import { InvokeApiService } from './invoke-api.service';

describe('InvokeApiService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: InvokeApiService = TestBed.get(InvokeApiService);
    expect(service).toBeTruthy();
  });
});
