/*
 * digitalpetri OPC-UA SDK
 *
 * Copyright (C) 2015 Kevin Herron
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.digitalpetri.opcua.sdk.client.methods;

import com.digitalpetri.opcua.stack.core.UaException;
import com.digitalpetri.opcua.stack.core.types.builtin.DiagnosticInfo;
import com.digitalpetri.opcua.stack.core.types.builtin.StatusCode;

public class UaMethodException extends UaException {

    private final StatusCode[] inputArgumentResults;
    private final DiagnosticInfo[] inputArgumentDiagnostics;

    public UaMethodException(StatusCode statusCode,
                             StatusCode[] inputArgumentResults,
                             DiagnosticInfo[] inputArgumentDiagnostics) {
        super(statusCode);

        this.inputArgumentResults = inputArgumentResults;
        this.inputArgumentDiagnostics = inputArgumentDiagnostics;
    }

    public UaMethodException(long statusCode,
                             StatusCode[] inputArgumentResults,
                             DiagnosticInfo[] inputArgumentDiagnostics) {
        super(statusCode);

        this.inputArgumentResults = inputArgumentResults;
        this.inputArgumentDiagnostics = inputArgumentDiagnostics;
    }

    public StatusCode[] getInputArgumentResults() {
        return inputArgumentResults;
    }

    public DiagnosticInfo[] getInputArgumentDiagnostics() {
        return inputArgumentDiagnostics;
    }
    
}
