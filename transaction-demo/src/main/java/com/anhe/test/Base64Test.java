package com.anhe.test;

import sun.misc.BASE64Decoder;

import java.io.*;
import java.nio.file.Files;

/**
 * Created by Albert.Tang on 2019/5/6 7:01 PM.
 */
public class Base64Test {
    public static void main(String[] args) throws IOException {
        String before="JVBERi0xLjQKMSAwIG9iago8PAovVHlwZSAvQ2F0YWxvZwovUGFnZXMgMyAwIFIKPj4KZW5kb2JqCjIgMCBvYmoKPDwKL1R5cGUgL091dGxpbmVzCi9Db3VudCAwCj4+CmVuZG9iagozIDAgb2JqCjw8Ci9UeXBlIC9QYWdlcwovQ291bnQgMQovS2lkcyBbMTggMCBSXQo+PgplbmRvYmoKNCAwIG9iagpbL1BERiAvVGV4dCAvSW1hZ2VCIC9JbWFnZUMgL0ltYWdlSV0KZW5kb2JqCjUgMCBvYmoKPDwKL1R5cGUgL0ZvbnQKL1N1YnR5cGUgL1R5cGUxCi9CYXNlRm9udCAvSGVsdmV0aWNhCi9FbmNvZGluZyAvTWFjUm9tYW5FbmNvZGluZwo+PgplbmRvYmoKNiAwIG9iago8PAovVHlwZSAvRm9udAovU3VidHlwZSAvVHlwZTEKL0Jhc2VGb250IC9IZWx2ZXRpY2EtQm9sZAovRW5jb2RpbmcgL01hY1JvbWFuRW5jb2RpbmcKPj4KZW5kb2JqCjcgMCBvYmoKPDwKL1R5cGUgL0ZvbnQKL1N1YnR5cGUgL1R5cGUxCi9CYXNlRm9udCAvSGVsdmV0aWNhLU9ibGlxdWUKL0VuY29kaW5nIC9NYWNSb21hbkVuY29kaW5nCj4+CmVuZG9iago4IDAgb2JqCjw8Ci9UeXBlIC9Gb250Ci9TdWJ0eXBlIC9UeXBlMQovQmFzZUZvbnQgL0hlbHZldGljYS1Cb2xkT2JsaXF1ZQovRW5jb2RpbmcgL01hY1JvbWFuRW5jb2RpbmcKPj4KZW5kb2JqCjkgMCBvYmoKPDwKL1R5cGUgL0ZvbnQKL1N1YnR5cGUgL1R5cGUxCi9CYXNlRm9udCAvQ291cmllcgovRW5jb2RpbmcgL01hY1JvbWFuRW5jb2RpbmcKPj4KZW5kb2JqCjEwIDAgb2JqCjw8Ci9UeXBlIC9Gb250Ci9TdWJ0eXBlIC9UeXBlMQovQmFzZUZvbnQgL0NvdXJpZXItQm9sZAovRW5jb2RpbmcgL01hY1JvbWFuRW5jb2RpbmcKPj4KZW5kb2JqCjExIDAgb2JqCjw8Ci9UeXBlIC9Gb250Ci9TdWJ0eXBlIC9UeXBlMQovQmFzZUZvbnQgL0NvdXJpZXItT2JsaXF1ZQovRW5jb2RpbmcgL01hY1JvbWFuRW5jb2RpbmcKPj4KZW5kb2JqCjEyIDAgb2JqCjw8Ci9UeXBlIC9Gb250Ci9TdWJ0eXBlIC9UeXBlMQovQmFzZUZvbnQgL0NvdXJpZXItQm9sZE9ibGlxdWUKL0VuY29kaW5nIC9NYWNSb21hbkVuY29kaW5nCj4+CmVuZG9iagoxMyAwIG9iago8PAovVHlwZSAvRm9udAovU3VidHlwZSAvVHlwZTEKL0Jhc2VGb250IC9UaW1lcy1Sb21hbgovRW5jb2RpbmcgL01hY1JvbWFuRW5jb2RpbmcKPj4KZW5kb2JqCjE0IDAgb2JqCjw8Ci9UeXBlIC9Gb250Ci9TdWJ0eXBlIC9UeXBlMQovQmFzZUZvbnQgL1RpbWVzLUJvbGQKL0VuY29kaW5nIC9NYWNSb21hbkVuY29kaW5nCj4+CmVuZG9iagoxNSAwIG9iago8PAovVHlwZSAvRm9udAovU3VidHlwZSAvVHlwZTEKL0Jhc2VGb250IC9UaW1lcy1JdGFsaWMKL0VuY29kaW5nIC9NYWNSb21hbkVuY29kaW5nCj4+CmVuZG9iagoxNiAwIG9iago8PAovVHlwZSAvRm9udAovU3VidHlwZSAvVHlwZTEKL0Jhc2VGb250IC9UaW1lcy1Cb2xkSXRhbGljCi9FbmNvZGluZyAvTWFjUm9tYW5FbmNvZGluZwo+PgplbmRvYmoKMTcgMCBvYmogCjw8Ci9DcmVhdGlvbkRhdGUgKEQ6MjAwMykKL1Byb2R1Y2VyIChGZWRFeCBTZXJ2aWNlcykKL1RpdGxlIChGZWRFeCBTaGlwcGluZyBMYWJlbCkNL0NyZWF0b3IgKEZlZEV4IEN1c3RvbWVyIEF1dG9tYXRpb24pDS9BdXRob3IgKENMUyBWZXJzaW9uIDUxMjAxMzUpCj4+CmVuZG9iagoxOCAwIG9iago8PAovVHlwZSAvUGFnZQ0vUGFyZW50IDMgMCBSCi9SZXNvdXJjZXMgPDwgL1Byb2NTZXQgNCAwIFIgCiAvRm9udCA8PCAvRjEgNSAwIFIgCi9GMiA2IDAgUiAKL0YzIDcgMCBSIAovRjQgOCAwIFIgCi9GNSA5IDAgUiAKL0Y2IDEwIDAgUiAKL0Y3IDExIDAgUiAKL0Y4IDEyIDAgUiAKL0Y5IDEzIDAgUiAKL0YxMCAxNCAwIFIgCi9GMTEgMTUgMCBSIAovRjEyIDE2IDAgUiAKID4+Ci9YT2JqZWN0IDw8IC9TbWFydFBvc3RTIDIwIDAgUgo+Pgo+PgovTWVkaWFCb3ggWzAgMCAyODggNDMyXQovVHJpbUJveFswIDAgMjg4IDQzMl0KL0NvbnRlbnRzIDE5IDAgUgovUm90YXRlIDA+PgplbmRvYmoKMTkgMCBvYmoKPDwgL0xlbmd0aCAzNDQxCi9GaWx0ZXIgWy9BU0NJSTg1RGVjb2RlIC9GbGF0ZURlY29kZV0gCj4+CnN0cmVhbQpHYXRVNz8mciRxJlxgYEBya2prRWRuOFQ7MVM0LWhdYU0mOUJOZGBHUWZOSF1bdC1GP1EmbkRWWU9DKy1xWj81Vj1kXFMjWjA6WnM1RnJEMwpMW0Zda28nbElBXDNPNE1zKWVsWjApbW1eWVUnL0wkYSpCanJaS2NxVSNyV2xkXTFBaUxaUWh1P1UnIk5JIVBfWTVROk1HYkM6VlovZThLaAo4P2dUPilbUE06VFNHMlg0VEZZbElKMWs/YF5yLExAIlJNPGY9KkU5aENPYEVdX3EwblpmVTJ1UVonJkRcXlMmO2hpKW9LZjVvdUFmOlE9SgpJZURoZlQuUSxMKDIqZD1yYyJsXWdfbTtzQyZETS1KbDU2RzE0NWJoXThfcjVXay8tJWArWmRGY2ElMDQrZVUoYF85K2Z1RVxrWipAQzxfLApua1Fbb2EhZlR1MzZJL0c1QDV1cVkoJEI/TnUsIUxeIlszdXBbLnBZbiFBNSY1UHNEdG81QlQoZGxNayUhVGg2IlVkSD8kXjRfYlBsTWdsRgo2KSU+ZylmSm05PlRZJFJdYGhQJnA9PV4oJGZyLERDclxhT2dXRnI/TCcuaj1YOTdaPzNXY1Y0MGxeXStUImQ9NklkdV5nYy5mLyJJc0hDRwo0RjJHTm1QX09tZ1k9Y2IsIys/LWpEcVdMcTpYbDlvLV9gI2cla0InKy5iKElCQVlqNl09OXRNWnRUV20jPjFWPDc4T1QrcD1SZ1QnKHE3PApmMj44UGpkTU5YUFxUQlA+V1pBTGNvXkpoYXN1JUQiMklKNjRJZUBlL1RcRVIkMzNhPz0lOT5sOFY+TD4uQHNpc0l0LkNIZjlcXmxvdE5eNwpVdEVOM0VVPm5uMEBsdVNraiQ0U2psdD09SXQjN1pMYmcxJ1Y/PTRNVyVtUVNKcmBEJFBfJVFCPyFmYCRlYG4mUmw+Ym9qaHVFXTgsVytWUgorblVJTDY7byYsTTZKT3VPLEE3LFRyUFtkczVNdXJPLlVnLXIrVUZwOU8pIWU+aWhEUVdPaEdGXk5cbW5OVCJ1VCMrVU5sTlxsRlY5MUUkYAojMDlsWDVgZydwcjk8KHNpbmFdMlRmQXVhUTE3dTQ4dEFIYkhXMWRFO1gqYkohUyU/Ri0iVzwsZVEvKC0pa2UkSihcT15YZCYhSFNbMVdiMApVMSVSZEZrKU5aWVgyUDVFRzpiUiM4a3J0PGw5dCk4Py5iLDwwLC9aSyVfRyxvbChZamBLXz9uNlkoMSZNMjliR1QhbEtTNkJPQ2xtL1VGbApJNlhWaihHSSsvMycscXI0PVVeSVdmTFQiMC1LQ1YtJSJwYFw9Y01ILD5gMCFpcyhyRFBJR15aSjNnMmVkc0llTCxsNjxmNGM+NDJuVlRbXwpkZD5pKjtrQ3RJZXVhUElHZVtzSTkwKjAxYTVWXDcvbTtxMTM+IylHT04qbE8vMXNPb2YkYFlKIj50OWY9IUU4KVJSaVcpTlZvcVo1JnMkOgooRyUwZTsoWlNPY0QzK1tYUFcjMEE4dEhqL2FwXFEiaENca01bXkY8RjFTNSwqWVdCZW9sXWhxZ1ohZWRbQ1JPbFwtP09YRzg0N2MwXDMzMgo5dC9CXD1EbyhpI2VnQkxiK3MxUy5LZVNBLjVzM2NtL1klJ0FaXUlKPjQsJHQ8RXEhVU4tVSpNJV5VdTo+WjxIM0RMK3RsKF9vWlRjZilRPwpSZjhLNDtdL3NzNj4vaG1cSTVHZ1Q2KGs6SyVeNXBWOD11XCIrai05SVU6bjRMOEFZTmFUT15VIixwLGhTQkZYYTlxKDdkUS0nL1wlW2JIKwpQXjcmajwmXC1GaCNVISFVOXJLaDZCW0xZIlMlaWYwJ1gqPENEZyZmT0s4KGo1KkgjJVdGVGxFLkkyJys2SCJrNSgpU2tCa0kjSisxUSYyNApaPCdUYCEyRGtwXWY4VWUtNFRZWGdkWixjKG84XXIjI05tWkxwYmNTSz1WNFVoNjUxYVRJYFpmWm9pSzEkbnM1dGJfaCdoRGRhVHBbXipcXgohWiMlOzU7MmtaZDtkcz9ETGtYZ0M/N0YsRmItLCRSXC1XMzBXTXBHWldcYVs+VV9UanJgTldyTVBebyJwVE5fUGldPVtUN01UJWtmUTlmYAowTj4kIz4tdSlEPCknOjtUNTQlTVdNNiIjL01RSUA5cyRRKlgoQC1MXk9ybHEkbj4pXTVKJylbYllARCdHSSxFbl9jL0plQjE1MTFsMi04aApQbFpXPWxJcmdaV0RXbW1DRysnYjAiTSZnMEtpT0NgKkNdMk1CLSlIIXRLIiFDQ3IvOSc3IVQzYEM2JHNGVHVYK0ZkXyhYQDoyclhGT1gvJApmMlQuOjd0Nmx0J0duLmhiMXNcMjNiPkRDL01fTyM7OlhiYl9mWEVtTTVAXWdFPGQ+WGlwIiU+LkIwUT5jRUcnPHBSJ0ZiPDdBRStwR1VqYgpAbEQrVighalNSZzljPVFcW2FuQUpQbClTbk1rLi1xSVVuXj48PFQ6RmBYWio4ITIvWy5XUXVAOTM+UyRJOWJAWz9EYVMnRFZuPzNSOC5hIQpqYC1ib0dgPTMvWkQyKVEwJSVyNiUuIyJcakkqUzhXRilAa0k2OV1iKiZlUjhlLigsMCRhaUVGIUFDR0BBaSI7JTFiYS0mSExaakVIYF5HNApjaSUmX15EN1lqRyQmcVJuUF5GRiQmZ2VUZFlHcCNPLE9daTAoYnQ9ZzVrbGhiQEgwJFdfTTRTLl8hajZpQGwtU085a0cvIms6Uzg9XCddawphUHBHS2EzaScnUidhPFxiLlsvdEI8amRoQz1hUTNERTs0S2dyO1A9NSo8WWJGZEhPLjxiY29OLSM7MyIuO29HLmU2XSIoOVNpQy8hXjAhQAoxRHNGa0dJYWZRbGpmLV0jKz0zI3MlWjoxZm8lQi0uNGhEV19YMjw/RHMtbGRHIytiT0AqZm9OT2M5WUkhazE6UDBfXnREL2tSREQwYlIoXwprJ2pWRzpMbkUhJ0BEISwiNFYkQmpTKTphJVpwbyFjLEFCNDNLUmRnZExWZGpSNEtzOycoYkFMKU1jQWtVJnJrPi0rX3MmRy0nNVAlNk1AdQo0LVdIO0Q4RVYsQ3UuYz5ZYUZScTxZSWNPL241W0MpMFVOcmglY04qaEdCSzNsM0NCN0s4WEpeQ082VUo6aVkqTEpIXWJwOmA6SmNdLjdUWApqIUFjKSRTInBCYlwzQk1cbDg7WFhGXD5RNi1BT1xxQ3IiQidANCE6L3VsQkErKTxtPV5HcFQ2WistL2QncksjXGFrQ186R1daYFhbI1w4JgpkcF0naF5MS1daVD8sckIhbSxiXzlvJGRJSmNgP2VCcic5K1Y3TnFQaWUiPltFOWVJTVlpNC9qa0xwW2ZkcC9bNFpha11FUEtSSFQ7MVc5KwpDTVYkbCErIWhlPmdQbW1LJDcya1hnTG4/NGVLJ2owTiJFQURKITJCXGRILF5aaWM4MTgsXiRZMy5pZzBPNSdTJWJROztSIShsPGU+OnFLNgoxYlwpcj5gXTM9Pms1R2okUk4mbi00PmJeJiU1TTZtRUYzVEcqUV1rOzN1ZzhRX1Qhcy1qdEAjQEwhYUlDOXVQPWE5N0JFL1MwSzEibGUrWQpkQzo0VnBJSUJdVE4+Z1k0Xz9zajE0ZEg9TVNpdFQ7NVVJZnFjSidWIXQ7NjZYWUFuW2dBR1ZZalxtJSllMSdzMzBwckFfMjxzVz0pLWchYgpnMzFmIylGQC8+Uy9fODQvaEUrLmVQRVUxRFhMVG40WEw4aVJZZUknMjpWSVQtN0BGPi8yL1E9cD4wajhWVmQ3NjlyS1wwITxzISU+QDQ6QQpEMWRBcEo3TzQ+VHU6MW1FMlgxIS1rcElaKmYnYnVXYUgkdGFUQTUoQyZeP0VTNXFjS1c0SjhVJVBbMHRdUUpGJWEoOSlJbnNEZFVKNVE5cQpSSE0pZTlVWF9yRVgqSDNUL1BYUSEtJEk4WUNhci5FKUgiZlhpS0ohb2FnaFNmQU9MWUQmOGglRWJoPWtRYGUvWS0jMW5SImdXOl9qOUtgNgolL1BUbUk5c2BoJC9ERHRpaEYkTVwha0EpIWM+ZkpOOWVxJlA2Ii1BZyxjcC5tOFdOU19hOmN1SDQwSV8kcG0uQyE9IjdYZ05FP2pFcHBrbQotYiRtaW8yWE1XPThGcF1vOTVqTzdlS2pHI0EzZjQxWyFtSjZPVVBcV200TmVYVVY3SjFYN2VSbUlsIUNyQi9wZ1FxcS9MVVRDVFJIaFlAOQpfZkxcQydDZWI3ckYwLmRraD0sOUpwdT1bPztJZD5icjtlViRuY2o6UT0qX3Q2RScuJ2ZUVHRSKGQvJ3NvP11FJjZVKzRjZj90LV9HV00xOQpyU1dAT2xaQD8kMCU1R1c0dUFWM201QVhPVi9QUk5vQzUxR2VcWmBGXD9CSW41THBWPFFgaVVOOjloR2pBMDo1Zyp1Rjg4PEdka3BUQzpoPAppY1BiLTJzPGFTWGFfUmxOQ0NBZ0o6ZF9tS2wsY0ohVmhSNCxsfj4KZW5kc3RyZWFtCmVuZG9iagoyMCAwIG9iago8PCAvVHlwZSAvWE9iamVjdAovU3VidHlwZSAvSW1hZ2UKL1dpZHRoIDU0Ci9IZWlnaHQgNTQKL0NvbG9yU3BhY2UgL0RldmljZVJHQgovQml0c1BlckNvbXBvbmVudCA4Ci9MZW5ndGggMzM2OAovRmlsdGVyIFsvQVNDSUk4NURlY29kZSAvRmxhdGVEZWNvZGVdCj4+c3RyZWFtCkdiIi9oR3UuSDYoPD9HLTpBJCdYaDciWjgsVSo6bjc3RSI/K0xraHJDVEZrTlVKPlVcU3ItXFBbSTcrMld1XlQ3cUhnLjJUPElea2VvJVpEClhlSDtKIUVpQTlLVG1iYyQhVF91Jmc1cSdfRTBbX1BaQVE6VTxbbFdqNWVMVmpOZF5QMzU5Z2NxND9LL1ooMS9WbzpKVFdRRDgvU0FmZSMjCkoyJVRZOCdxSG8nMCkiXmZPSFknKT85YzQ/VGFYS0EvdD90YiNRJnNtKiYhbjkyRj1BTF5iXGJXO3V1USJJT05BKTFrZzknVUxJW2VqJV5kCiEuWSkocj1kPzhmNWJxWFQnc0QuaUdwdHJCIV1uO1kmQzhAPGlgOjc2VztVOENNUGtQUkI2c3NsVFQ3SykpKm9KITYuOVdvJEdhUlM/KUJPCmtdJCRucVBNRUBpcSJQNDNLZVlJRD1uOkNCPmw3Oy1STDJkLTdAJkJaJCttPE8ic00kYmRwWUw/RGZTXUdmUDVhX1VKUGMoZDhQQyo0Ri5ZCk9yTzVjVmYucyNOI2lXRixbamdrN3JeN01MXzJXKywpIW0qTmFZRV9haT9uIVkxVz09Uj1ebzNLOEZlMypzJihZXzQsUDNRYk09SydHbyIsCihrSj46OFsyWTsvWVNTPWo1OmpYTi47OjRTLWtsSkQ7RlcwaGJcJGhHL2xyckY/KEFEZ0BFU2FYY0Y+QUplQj1yIVltNkcsW2RERWdvJ1ZPClBbUVAvQTImXCROSyZFSnJUWXVCRCw8YkYkLWhrSzFdUTVGMU5rVDdPKDNXSU8+KVdYQEpjTU84VyZaJz5VKl9xTCpYXTpra25HLTk8K0hkCj1gKiUlU1tvXz5sQEx1WCY+UkEoUzU1P2lhPHVgSCUhczBAVFo+ak5fYVklRkEwQ0RfVCQmQVo4WVYjV2giOGZIQU9ham5McVhHa2sxN3VJCjAsQjVhY3A2Q0g1ayNnZjVSQVEiYSVoR1koOHBMOkVPIXQ+N1lcMDdGaGgrSmwlLm5AIkE3K0oyMSopPDJqam5rVUclO0ZQbSpkczovaydKCik5MCIlSjRDOVlCZXBPPkorVmdwPkJhJTBqJWFTa2VsUEFuL1BRTl5PY1YhLWRVJV0lQmFUSD9JLCQ2TW5uWDM4cm1UM14tJXBkIz5dZilKCms5Ym1rJjA3Pkw6NkdgLD1UQXReNiMhQ0FpcDtrcz5xVyVfYj5fXENFb1FUNktTWCJVK1pLdVhfX05YXyJpbjhzciteKSxmcTNyI05jJSZUCmRlUSZkX2tiL0xcSys0TkdcR1YpOkczS1FYU3AwZCJNVi5HbyhyTS5VTFkncTssWkFoP29cOzw2LSw0K3MxMkw0bigzRTJQTC09UldCXEtnClxobE1kSzlbKEAuJTcjMC5RMlIhOzNjVGxndTM7RU5GZGguLjhzQFBUdSRQZEd0OFBlN0YkLUFyUTs2VzQnXlxrNjxBTHNzMi8lV1thI2A1CkxudXJxLURXJkNSWygxZl1WXTkwRWI5MCw0U1I2LDNLJmJhTSRUZz1MZSFGOUxGOWNhXGtsc2lkY2lELFthZEI2bUM5WWQvdDxPSCY0Mk8nCi1kPm5HcStlVj9jci5rZk5PTFM+QjFeNzlLVU1BUCQrI2cvJyZtUUo+LXIwa0clbkEzalpnVy1WWEQ7J2cldXJBK0opUksxLCtfRTYnSmMhCjNgZkpBYzh1OSxLVykudFtib1ZLSEElPXQsWiU0S1kvPiFxcGh1RzBTWWc6R3A4JmpTNz4+ZSVfZyVCN2kncEJQMG1pZUVgc1FeYlsuVEU1CjxobjNiXSxqWF9xMiVxaDJJLzdfSVUhXidNLEcmPj5CPU05IyNAaVhVMTlCbj1oMCItcmxoXyVHcFQ7ZU1RNXFnS0ArLzVuVE1zKiFySi5jCk5TOU9vcWQ1QCUlOGZcaHFabTk+JmdOIiRATUlsc0UvNlYtLzNJKyhdXWt1SjpTLGtTYnEybjFDN0ZqTU5cOE0nOG0sTCw/K2QiMlErKGdTClM1XyVrZUJxTERIMz1ZTDtBOkpBMGFxTldRMzdHSjZwc01ALzcsYj5JSjohYmM1KVtGbFdUOEBUZDZAbmc7W1BVUSFYN1MxMWA6IiQ1M1E5CitDazgoL3FNXCtDY0ZeLFo0YCQ7Jk1bJFcrYzw0TzNLI11lSUBQTVpfSVUlYmlfPGJwWE5QPDpcKSJdRXFXNC1mMGU+YmYoXlxNMyNYcz1KCixXRklycUhXZk0idVQmSWkqMi5QSzlZdG9JWl4yKWxhNjNiOyM2cHBFN28pPzohKFpLNTFvTnBpcTJkMytSJE5jJSRWUzM3bzBpOTYjc2wjCjZjMDtJXllJVzM9R0BzZjsrVDNkZm5bbC5XJk5FTylQUDM8JVdiaXFwITlITjpTJ09kcGsqZUpjPC4+WmNBXkRDLjhOQmRFXCliY19QO29SCkEnWSMrWC9sSGhaQyJURGMrJFNMaDgrPG0pYTQwRW9RJU85KCUhaWRcJFsoRls/XWptN0Z1VWRjUTt1UWk6YkZdUTdsRFkoRFNZTzguJ25NCiZfK2poJSNaP25ZZGRFIkFxKzAhRFI5PSNFO1dCKClkTVQmbThja00+SDspXlczK0lHRFZxdHJtM2VxTToqJTRyRTlIKUZQMHRWLDlDW15jCkoqK1EuYXNQVDQsSjdZS1NJZWlBbEpjVElXQHM2ciY+VDxqPWBJVnNNWlpFcC5kLTRzPEFhSycmL25CJ1dQLTl0WE9ITS5jKDRxYCMiLDwtCjUlR1JUM3BgPHBDTVRRIUtpaHE5MDs0VTslIVdzYVdFYFQnZGVKQz9Ca3UsUTNlJC8qU3JAT05Ca11YYUcoPS8iVj0zLjpoUGdSIWByUFw8Cm4qIlMqMzwkRDskO3V0QW1VPzxFOEpMWHMpNWhrcjwpciNiNkMxXE5JZj9gZic/M0BYNj9oOm1HSzVHcz5JTzlVPiFwbydLWTVdb0lxODpRCikrYkYpZURpbjdIbWhpQVFeK1EiSU5cISMySk1TIT5kYGQwM0NBVSJHOERvJ0FKMWhLO1VWX0spWXAoLWc9aURncyQ+QDsxXWApNDY6KUE/CjRCQGw7VGRtODsjQFRSSztKLnVaZWkuTmsqNWMwR1MzPkMzM1kjY29gJkJuQUdJUTZcI1U7Ly1GVlZDNjxtNjE7TVkvZl8xc0xpVU9jY10uCmV0NEEqZ1lzJGRETVBkVzwtSXJhaVE1TkUnWkVWVjhWOD9ZODlpQFFJc2RTYVVNSzEuKWJxZkRTSU9sNGNoREBIJ0VYaSstZkk9cWBfZjI7ClJzSFhhTjJFYzZsNXI+WSRoTW8mNUByJzE2M1J1MWgsPkZFJnBmK2JXUUVvZyprR0hRVTk7JTI+SD85XSsjci0tPDtfLjJxXyovMz08PTYhCk9zb2BNL2R0KWo4NVNCW0dKRD5FQ1pbX0guRjVgaDZdOCxGVnAjVWQqI1Y6JmRON1lsJkhpNTVZV1AmLGtuaTVaWlMkQkFsSU9KN1hdcjVNCmclYS9WWC1QRSsxL1o9Tys8KS9ka3RUYlNgRlNWKFNgYmtlLTpkZ0RdOEFkYENvXjxwSXJxaEs+WFhaaVk6OU9zSjs/WikrLStnVWFSSTltCicuNktUUmhTInNfTSN1YlUlRFxdTi1LQGdKUSJeaFFcRmkzUHRZO2pwUFtJJzZVK05FOEVmJXBGSHA1JD44SlMlcCZ1YWpwOmBNTCZAQUs/Ck4vPkp0VEVsPj8tXFBeaDBZYERgUTZmJzFPaUJXW0IkUDdRZyIoWitub2F1Wl88XVNzKylaRko+UyckblBdczxgJy9nNyZFQ2VKXistUXRmCiZVb25RKEtZOGNgLyNaY0gsXEFxQUtBMltvPVhPN2Z1YCI3YkRRbUo/UUMvZF5dRylULWJNdE9YbE5QTU1rWEA7InQ8O1UiTWRTcixOPChjCkhGZmNWaD1gTltbTVAqRkNUPkx1cVghbjlcPlRyVixTKFNpZiJHQVVkRyMoJGRfYEgkKF9xbF1OMDhtVE1iLjdHaVVPNnVlLiQkZTVpVUxpCkteUmcpPjw8YidhcFBJTWxxLSpFaWhbc0ljQ0dnaipbWzVzJ2xyN2UvbjNocXE5TFs/bC4lQj9odSwjVF5VMSNMWFYyP0VkLV1cT0tRLXRoCnImZmFFQktiOm5GPy1GLiMoOUZgPGlgQVNjYiNAKFBFVkpfL0plbSNLdCIsNDItT2pmOj5hSzJJPU8zdFY/VlBPaGt1UiM2RVxCakdIU09PCmVdaUxRWzJLbiouazMidWlEVTYsLmVTR09gM1g0XCEuX25Jck9iISRbYDk4L2YoQTR1UDMwdFtTMVZDY0gqZGQ+X1VKUS5FSGJhYCZwYlpECjRRM1FjNG4hODBdY2VkKCUjIWV0b1huc2FONWM7JEVxck4uIjVFaFYzNTcjY34+CmVuZHN0cmVhbQplbmRvYmoKeHJlZgowIDIxCjAwMDAwMDAwMDAgNjU1MzUgZiAKMDAwMDAwMDAwOSAwMDAwMCBuIAowMDAwMDAwMDU4IDAwMDAwIG4gCjAwMDAwMDAxMDQgMDAwMDAgbiAKMDAwMDAwMDE2MiAwMDAwMCBuIAowMDAwMDAwMjE0IDAwMDAwIG4gCjAwMDAwMDAzMTIgMDAwMDAgbiAKMDAwMDAwMDQxNSAwMDAwMCBuIAowMDAwMDAwNTIxIDAwMDAwIG4gCjAwMDAwMDA2MzEgMDAwMDAgbiAKMDAwMDAwMDcyNyAwMDAwMCBuIAowMDAwMDAwODI5IDAwMDAwIG4gCjAwMDAwMDA5MzQgMDAwMDAgbiAKMDAwMDAwMTA0MyAwMDAwMCBuIAowMDAwMDAxMTQ0IDAwMDAwIG4gCjAwMDAwMDEyNDQgMDAwMDAgbiAKMDAwMDAwMTM0NiAwMDAwMCBuIAowMDAwMDAxNDUyIDAwMDAwIG4gCjAwMDAwMDE2MjIgMDAwMDAgbiAKMDAwMDAwMTk2NSAwMDAwMCBuIAowMDAwMDA1NDk4IDAwMDAwIG4gCnRyYWlsZXIKPDwKL0luZm8gMTcgMCBSCi9TaXplIDIxCi9Sb290IDEgMCBSCj4+CnN0YXJ0eHJlZgo5MDUxCiUlRU9GCg==";
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] decodeBuffer = decoder.decodeBuffer(before);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(decodeBuffer);

        OutputStream outputStream = new FileOutputStream("/Users/circleus/Documents/tmp/20190506/my.pdf");
        byte[] buff = new byte[1024];
        int len = -1;
        while ((len = inputStream.read(buff)) != -1) {
            outputStream.write(buff);
        }
        outputStream.flush();
        inputStream.close();
        outputStream.close();
    }
}
