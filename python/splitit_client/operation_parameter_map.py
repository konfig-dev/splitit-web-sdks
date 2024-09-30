operation_parameter_map = {
    '/api/installmentplans/check-eligibility-POST': {
        'parameters': [
            {
                'name': 'X-Splitit-IdempotencyKey'
            },
            {
                'name': 'X-Splitit-TouchPoint'
            },
            {
                'name': 'PlanData'
            },
            {
                'name': 'CardDetails'
            },
            {
                'name': 'BillingAddress'
            },
            {
                'name': 'ShopperIdentifier'
            },
        ]
    },
    '/api/installmentplans/{installmentPlanNumber}-GET': {
        'parameters': [
            {
                'name': 'installmentPlanNumber'
            },
            {
                'name': 'X-Splitit-IdempotencyKey'
            },
            {
                'name': 'X-Splitit-TouchPoint'
            },
        ]
    },
    '/api/installmentplans/{ipn}/legal-GET': {
        'parameters': [
            {
                'name': 'ipn'
            },
            {
                'name': 'X-Splitit-IdempotencyKey'
            },
            {
                'name': 'X-Splitit-TouchPoint'
            },
        ]
    },
    '/api/installmentplans/initiate-POST': {
        'parameters': [
            {
                'name': 'X-Splitit-IdempotencyKey'
            },
            {
                'name': 'X-Splitit-TouchPoint'
            },
            {
                'name': 'AutoCapture'
            },
            {
                'name': 'Attempt3dSecure'
            },
            {
                'name': 'Shopper'
            },
            {
                'name': 'PlanData'
            },
            {
                'name': 'BillingAddress'
            },
            {
                'name': 'RedirectUrls'
            },
            {
                'name': 'UxSettings'
            },
            {
                'name': 'EventsEndpoints'
            },
            {
                'name': 'ProcessingData'
            },
            {
                'name': 'X-Splitit-TestMode'
            },
            {
                'name': 'X-Splitit-Strategy'
            },
            {
                'name': 'Splititclientinfo'
            },
        ]
    },
    '/api/installmentplans-POST': {
        'parameters': [
            {
                'name': 'AutoCapture'
            },
            {
                'name': 'TermsAndConditionsAccepted'
            },
            {
                'name': 'X-Splitit-IdempotencyKey'
            },
            {
                'name': 'X-Splitit-TouchPoint'
            },
            {
                'name': 'Attempt3dSecure'
            },
            {
                'name': 'Shopper'
            },
            {
                'name': 'PlanData'
            },
            {
                'name': 'BillingAddress'
            },
            {
                'name': 'PaymentMethod'
            },
            {
                'name': 'RedirectUrls'
            },
            {
                'name': 'ProcessingData'
            },
            {
                'name': 'EventsEndpoints'
            },
            {
                'name': 'X-Splitit-TestMode'
            },
            {
                'name': 'X-Splitit-Strategy'
            },
            {
                'name': 'Splititclientinfo'
            },
        ]
    },
    '/api/installmentplans/{installmentPlanNumber}/refund-POST': {
        'parameters': [
            {
                'name': 'Amount'
            },
            {
                'name': 'installmentPlanNumber'
            },
            {
                'name': 'X-Splitit-IdempotencyKey'
            },
            {
                'name': 'X-Splitit-TouchPoint'
            },
            {
                'name': 'RefundStrategy'
            },
            {
                'name': 'ReferenceId'
            },
        ]
    },
    '/api/installmentplans/search-GET': {
        'parameters': [
            {
                'name': 'X-Splitit-IdempotencyKey'
            },
            {
                'name': 'X-Splitit-TouchPoint'
            },
            {
                'name': 'installmentPlanNumber'
            },
            {
                'name': 'refOrderNumber'
            },
            {
                'name': 'extendedParams'
            },
        ]
    },
    '/api/installmentplans/{installmentPlanNumber}/updateorder-PUT': {
        'parameters': [
            {
                'name': 'installmentPlanNumber'
            },
            {
                'name': 'X-Splitit-IdempotencyKey'
            },
            {
                'name': 'X-Splitit-TouchPoint'
            },
            {
                'name': 'RefOrderNumber'
            },
            {
                'name': 'TrackingNumber'
            },
            {
                'name': 'Capture'
            },
            {
                'name': 'ShippingStatus'
            },
            {
                'name': 'NewAmount'
            },
        ]
    },
    '/api/installmentplans/updateorder-PUT': {
        'parameters': [
            {
                'name': 'X-Splitit-IdempotencyKey'
            },
            {
                'name': 'X-Splitit-TouchPoint'
            },
            {
                'name': 'RefOrderNumber'
            },
            {
                'name': 'TrackingNumber'
            },
            {
                'name': 'Capture'
            },
            {
                'name': 'ShippingStatus'
            },
            {
                'name': 'NewAmount'
            },
            {
                'name': 'Identifier'
            },
        ]
    },
    '/api/installmentplans/{installmentPlanNumber}/verifyauthorization-GET': {
        'parameters': [
            {
                'name': 'installmentPlanNumber'
            },
            {
                'name': 'X-Splitit-IdempotencyKey'
            },
            {
                'name': 'X-Splitit-TouchPoint'
            },
        ]
    },
};